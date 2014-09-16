package org.grapeCity.restAssignment.domain;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "requestFileDetails")
public class RequestDirectoryList {

    @XmlAttribute(required = true)
    @XmlSchemaType(name = "anySimpleType")
	    private String dirPath;

		public String getDirPath() {
			return dirPath;
		}

		public void setDirPath(String dirPath) {
			this.dirPath = dirPath;
		}

}
