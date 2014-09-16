/**
 * 
 */
package org.grapeCity.restAssignment;

import javax.xml.bind.JAXBException;

import org.grapeCity.restAssignment.domain.Files;
import org.grapeCity.restAssignment.domain.RequestFileDetails;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

/**
 * @author jack
 * 
 */
public class ClientTest {

	/**
	 * @param args
	 */
	private static final String URL = "http://localhost:9080/directory-file-service/service/files";
	
	private static void requestFileDetails(){
		RequestFileDetails request = new RequestFileDetails();
		request.setDirName("E:/m/Arziyan.mp3");
		try {			
			Client client = Client.create();
			WebResource webResource = client.resource(URL);
			WebResource.Builder builder = webResource.accept("application/xml");
			ClientResponse response = builder.post(ClientResponse.class,
					request);
			 if(response.getStatus() == 200){
				 System.out.println("fetching the data..");
				 Files files = response.getEntity(Files.class);
				 try {
						javax.xml.bind.JAXBContext jaxbCtx = javax.xml.bind.JAXBContext.newInstance(Files.class);
				        javax.xml.bind.Marshaller marshaller = jaxbCtx.createMarshaller();
				        marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_ENCODING, "UTF-8"); //NOI18N
				        marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);				       
							marshaller.marshal(files, System.out);
						} catch (JAXBException e) {
							e.printStackTrace();
						}
		        }else{
		        	System.out.println("Error ------>" + response.getStatus());
		        }
		} catch (Exception e) {
			System.out.println("Error ------>" + e.getMessage());
		}

	}

	public static void main(String[] args) {
		requestFileDetails();		
	}
}
