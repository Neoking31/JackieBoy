/**
 * 
 */
package org.grapeCity.restAssignment.service;

import java.io.File;
import java.io.IOException;

import org.grapeCity.restAssignment.domain.Directory;
import org.grapeCity.restAssignment.domain.Files;
import org.grapeCity.restAssignment.utilities.Utils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * This Implementation provides file or directory related services for the requested web service 
 * 1.	Provide files/directories within a given directory (and optionally its subdirectories) which match the directory path.
 * 2.	Provide files and its attributes within a given file which match the file path.
 * 
 * @author Gaurav Asthana
 * @version 1.0 Date - 18 Jan 2014 *
 */
@Service
public class DirectoryServiceImpl implements DirectoryService {
	
	/** set the file reference to hold file object */
	private Files files = null;
	
	/** set the directory list reference */
	private Directory directoryList = null;
	
	/* set the File Object to hold the input file */
	private static File inputFile;
	
	/** set the logger */
	private static final Logger log = LoggerFactory.getLogger(DirectoryServiceImpl.class);
	
	
	
	/* 
	 * Provide files and its attributes within a given file which match the file path.
	 */
	@Override
	public Files getFileDetails(String filePath) {		
		inputFile = new File(filePath);
		/* canonical path to verify the file validity*/
		String canonicalPath = "";
		try {
			canonicalPath = inputFile.getCanonicalPath();
		} catch (IOException ioException) {
			log.warn("getFiles(): provided file path is not valid" + ioException.getMessage());
		}
		if (!Utils.checkNullOrBlank(inputFile) && !Utils.checkNullOrBlank(canonicalPath)) {
			if (inputFile.isFile()) {
				files = new Files();
				log.info("getFileDetails(): Requested input file is valid and of \"FILE\" type - fetching the attributes now.");
				files = setAllFileAttributes(inputFile,files);				
			}else{
				log.warn("getFiles(): Requested input path doesn't have a file name or is not a valid file.");
			}
		}else{
			log.warn("getFiles(): does not find file path.");
		}
		return files;
	}

		/* 
	 * Provide files/directories within a given directory (and optionally its subdirectories) which match the directory path.
	 */
	@Override
	public Directory getDirectoryList(String dirPath) {
		inputFile = new File(dirPath);
		/* canonical path to verify the directory validity*/
		String canonicalPath = "";
		try {
			canonicalPath = inputFile.getCanonicalPath();
		} catch (IOException ioException) {			
			log.warn("getDirectoryList(): provided directory path is not valid" + ioException.getMessage());
			return null;
		}
		if (!Utils.checkNullOrBlank(inputFile) && !Utils.checkNullOrBlank(canonicalPath)) {
			if (inputFile.isDirectory()) {
				//directoryList = new Directory();
				log.info("getDirectoryList(): Requested input directory path is valid and of \"DIR\" type - Populating the list now..");
				//directoryList = getDirectoryList(inputFile);				
			}else{
				log.warn("getDirectoryList(): Requested input path doesn't have any directory or is not a valid directory.");
			}
		}else{
			log.warn("getFiles(): does not find directory path.");
		}
		return directoryList;
	}

	

	/**
	 * method to set the attributes of the file like last modified time, absolute path, file type, file size and file permissions
	 * @param inputFile
	 * @param files
	 * @return
	 */
	private Files setAllFileAttributes(File inputFile, Files files) {
		log.info("getFileDetails(): setting attributes");
		files.setAbsolutePath(inputFile.getAbsolutePath());
		files.setMtime(String.valueOf(inputFile.lastModified()));
		files.setSize(String.valueOf(inputFile.length()));
		files.setType("FILE");
		files.setReadable(inputFile.canRead() ? "True" : "False");
		files.setWritable(inputFile.canWrite() ? "True" : "False");
		files.setExecutable(inputFile.canExecute() ? "True" : "False");
		return files;
	}


}
