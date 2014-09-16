package org.grapeCity.restAssignment.domain;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "requestFileDetails")
public class RequestFileDetails {
	 
	    private String dirName;

		public String getDirName() {
			return dirName;
		}

		public void setDirName(String dirName) {
			this.dirName = dirName;
		}
	 
}
