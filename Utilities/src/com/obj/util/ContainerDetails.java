package com.obj.util;

import javax.xml.bind.annotation.XmlElement; 


public class ContainerDetails {

	private String containerNr;
	private String contSize;
	private String trackNo;
	private String sealNr;
	private String status;
	private String ETA;
	private String ATA;
	private String ETD;
	private String ATD;
	private String transferDate;
	
	
	public ContainerDetails() {}
	public ContainerDetails(String containerNr, String contSize,String trackNo,String sealNr,String status,String ETA,String ATA,String ETD,String ATD,String transferDate) {
		super();
		this.containerNr = containerNr;
		this.contSize = contSize;
		this.trackNo = trackNo;
		this.sealNr = sealNr;
		this.status = status;
		this.ETA = ETA;
		this.ATA = ATA;
		this.ETD = ETD;
		this.ATD = ATD;
		this.transferDate = transferDate;
	}

	
	@XmlElement(name="CONTAINERNR") 
	public String getContainerNr() {
		return containerNr;
	}


	public void setContainerNr(String containerNr) {
		this.containerNr = containerNr;
	}

	@XmlElement(name="")
	public String getContSize() {
		return contSize;
	}


	public void setContSize(String contSize) {
		this.contSize = contSize;
	}

	@XmlElement(name="TRACKNO")
	public String getTrackNo() {
		return trackNo;
	}


	public void setTrackNo(String trackNo) {
		this.trackNo = trackNo;
	}

	@XmlElement(name="SEALNR")
	public String getSealNr() {
		return sealNr;
	}


	public void setSealNr(String sealNr) {
		this.sealNr = sealNr;
	}

	@XmlElement(name="STATUS")
	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}

	@XmlElement(name="ETA")
	public String getETA() {
		return ETA;
	}


	public void setETA(String eTA) {
		ETA = eTA;
	}

	@XmlElement(name="ATA")
	public String getATA() {
		return ATA;
	}


	public void setATA(String aTA) {
		ATA = aTA;
	}

	@XmlElement(name="ETD")
	public String getETD() {
		return ETD;
	}


	public void setETD(String eTD) {
		ETD = eTD;
	}

	@XmlElement(name="ATD")
	public String getATD() {
		return ATD;
	}


	public void setATD(String aTD) {
		ATD = aTD;
	}

	@XmlElement(name="TRANSFERDATE")
	public String getTransferDate() {
		return transferDate;
	}


	public void setTransferDate(String transferDate) {
		this.transferDate = transferDate;
	}
	
	
	
}
