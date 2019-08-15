package com.obj.util;

import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class ContainerDelivery {
	private String documentNumber;
	private String documentType;
	private List<ContainerDetails> containerDetails;
		
	public ContainerDelivery() {}
	public ContainerDelivery(String documentNumber, String documentType, List<ContainerDetails> containerDetails) {
		super();
		this.documentNumber = documentNumber;
		this.documentType = documentType;
		this.containerDetails = containerDetails;
	}
	
	@XmlElement(name="CONTAINERDETAILS")
	public List<ContainerDetails> getContainerDetails() {
		return containerDetails;
	}
	public void setContainerDetails(List<ContainerDetails> containerDetails) {
		this.containerDetails = containerDetails;
	}
	@XmlElement(name="DOCUMENTNUMBER")
	public String getDocumentNumber() {
		return documentNumber;
	}
	public void setDocumentNumber(String documentNumber) {
		this.documentNumber = documentNumber;
	}
	@XmlElement(name="DOCUMENTTYPE")
	public String getDocumentType() {
		return documentType;
	}
	public void setDocumentType(String documentType) {
		this.documentType = documentType;
	}
	
	
	
}
