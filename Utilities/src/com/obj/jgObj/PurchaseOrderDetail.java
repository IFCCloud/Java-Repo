package com.obj.jgObj;

import javax.xml.bind.annotation.XmlElement;

public class PurchaseOrderDetail {
	
	private String colourcode;
	private String colourdesc;
	private String sizecode;
	private String sizedesc;
	private String sku;
	private String quantity;
	private String uom;
	
	
	public PurchaseOrderDetail() {}

	@XmlElement(name="COLOURCODE")
	public String getColourcode() {
		return colourcode;
	}


	public void setColourcode(String colourcode) {
		this.colourcode = colourcode;
	}

	@XmlElement(name="COLOURDESC")
	public String getColourdesc() {
		return colourdesc;
	}


	public void setColourdesc(String colourdesc) {
		this.colourdesc = colourdesc;
	}

	@XmlElement(name="SIZECODE")
	public String getSizecode() {
		return sizecode;
	}


	public void setSizecode(String sizecode) {
		this.sizecode = sizecode;
	}

	@XmlElement(name="SIZEDESC")
	public String getSizedesc() {
		return sizedesc;
	}


	public void setSizedesc(String sizedesc) {
		this.sizedesc = sizedesc;
	}
	
	@XmlElement(name="SKU")
	public String getSku() {
		return sku;
	}


	public void setSku(String sku) {
		this.sku = sku;
	}

	@XmlElement(name="QUANTITY")
	public String getQuantity() {
		return quantity;
	}


	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	@XmlElement(name="UOM")
	public String getUom() {
		return uom;
	}


	public void setUom(String uom) {
		this.uom = uom;
	}
	
	

}
