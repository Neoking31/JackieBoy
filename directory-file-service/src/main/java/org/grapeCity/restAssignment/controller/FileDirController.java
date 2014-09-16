package org.grapeCity.restAssignment.controller;

import javax.xml.bind.JAXBException;

import org.apache.commons.lang3.Validate;
import org.grapeCity.restAssignment.domain.Directory;
import org.grapeCity.restAssignment.domain.Files;
import org.grapeCity.restAssignment.domain.RequestDirectoryList;
import org.grapeCity.restAssignment.domain.RequestFileDetails;
import org.grapeCity.restAssignment.service.DirectoryService;
import org.grapeCity.restAssignment.utilities.Utils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
/**
 * This service is responsible to process the requested operation (methods) 
 * 
 * Method 1: Given a full path to a directory as a parameter, return an XML that contains description of all the files and directories (recursively) 
 * under the one given as the parameter. The description must include a full path, size and a flag if the entry is a directory or a file.
 * 
 * Method 2: Given a full path to a file as a parameter, return an XML that contains a full description of that file . 
 * The description must include a full path and all of the attributes available in the JDK 6 for a file object (e.g. read, write, execute, etc).
 * 
 * @author Gaurav Asthana
 * @version 1.0 Date - 18 Jan 2014
 */
@Controller
@RequestMapping(value = "/service")
public class FileDirController {
	/** set the logger */
	private static final Logger log = LoggerFactory.getLogger(FileDirController.class);

	
	/**
	 * A reference to DirectoryService
	 */
	@Autowired
	private DirectoryService directoryService;
	
	

	/**
	 * Method : Given a full path to a file as a parameter, return an XML that contains a full description of that file . 
	 * 			The description must include a full path and all of the attributes available in the JDK 6 for a file object (e.g. read, write, execute, etc).
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/{filePath}", method = RequestMethod.POST)
	@ResponseBody
	public Files getFileDetails(@RequestBody RequestFileDetails request) {
		log.info("getFileDetails() - Service invoked for requesting file and attribute details");
		String filePath = request.getDirName();
		Files files = null;
		if (!Utils.checkNullOrBlank(filePath)) {

			log.info(
					"getFileDetails() - calling directoryService to get the details for file Path - ",
					filePath);
			
			files = directoryService.getFileDetails(filePath);
			
			if(!Utils.checkNullOrBlank(files)){
			log.info("getFileDetails() - logging XML response in the logs");
			setXMLResponseInLogger(files);
			}else{
				log.warn("getFileDetails() - Unable to find file with file path: "
					+ filePath);
			}
			//Validate.isTrue(files != null, "Unable to file with file path: "+ filePath);
		}else{
			log.warn("getFileDetails() - Please provide the full file path");
		}
		return files;
	}
	
	/**
	 * Method : Given a full path to a directory as a parameter, return an XML that contains description of all the files and directories (recursively) 
	 * under the one given as the parameter. The description must include a full path, size and a flag if the entry is a directory or a file.
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/{dirPath}", method = RequestMethod.POST)
	@ResponseBody
	public Directory getDirectoryList(@RequestBody RequestDirectoryList request) {
		log.info("getDirectoryList() - Service invoked for directory listing for the requested directory path.");
		String dirPath = request.getDirPath();
		Directory dirList = null;
		if (!Utils.checkNullOrBlank(dirPath)) {

			log.info(
					"getDirectoryList() - calling directoryService to list the directory for this path - ",
					dirPath);

			dirList = directoryService.getDirectoryList(dirPath);

			if (!Utils.checkNullOrBlank(dirList)) {
				log.info("getDirectoryList() - logging XML response in the logs");
				setXMLResponseInLogger(dirList);
			} else {
				log.warn("getDirectoryList() - Unable to find directory with directory path: "
						+ dirPath);
			}
			// Validate.isTrue(files != null,
			// "Unable to directory with directory path: "+ dirPath);
		} else {
			log.warn("getDirectoryList() - Please provide the full directory path");
		}
		return dirList;
	}
	
	/**
	 * /*
	 * This method is used to write the the XML response in the log file	 
	 * @param files
	 */
	private void setXMLResponseInLogger(Object loggingObject) {
		javax.xml.bind.JAXBContext jaxbCtx =  null;
		try {
		if(loggingObject instanceof Files){
			jaxbCtx = javax.xml.bind.JAXBContext.newInstance(Files.class);
		}else if(loggingObject instanceof Directory){
			jaxbCtx = javax.xml.bind.JAXBContext.newInstance(Directory.class);
		}
		log.error("setXMLResponseInLogger() - logging data in log file....");
        javax.xml.bind.Marshaller marshaller = jaxbCtx.createMarshaller();
        marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_ENCODING, "UTF-8"); //NOI18N
        marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);       
			marshaller.marshal(loggingObject, System.out);
			
		} catch (JAXBException jAXBException) {
			log.error("setXMLResponseInLogger() - Unable to log response"+ jAXBException.getMessage());
		}
		
		
	}

	/**
	 * exception handler - The request could not be understood by the server due to malformed syntax. 
	 * The client SHOULD NOT repeat the request without modifications. 
	 * Might be 404 code.
	 * @param ex
	 * @return
	 */
	@ExceptionHandler(IllegalArgumentException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ResponseBody
	public String handleClientErrors(Exception ex) {
		log.error(ex.getMessage(), ex);
		return ex.getMessage();
	}

	/**
	 * exception handler - The server encountered an unexpected condition which prevented it from fulfilling the request. 
	 * Might be 500, 501 ... etc code
	 * @param ex
	 * @return
	 */
	@ExceptionHandler(Exception.class)
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	@ResponseBody
	public String handleServerErrors(Exception ex) {
		log.error(ex.getMessage(), ex);
		return ex.getMessage();
	}
}
