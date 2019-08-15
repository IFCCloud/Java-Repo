package com.obj.jgObj;

import javax.xml.bind.annotation.XmlElement;


public class PurchaseOrderPackDetail {
	private String packcode;
	private String packquantity;
	private String sku;
	private String skuquantityinpack;
	
		
	public PurchaseOrderPackDetail() {}


	@XmlElement(name="PACKCODE")
	public String getPackcode() {
		return packcode;
	}


	public void setPackcode(String packcode) {
		this.packcode = packcode;
	}

	@XmlElement(name="PACKQUANTITY")
	public String getPackquantity() {
		return packquantity;
	}


	public void setPackquantity(String packquantity) {
		this.packquantity = packquantity;
	}

	@XmlElement(name="SKU")
	public String getSku() {
		return sku;
	}


	public void setSku(String sku) {
		this.sku = sku;
	}

	@XmlElement(name="SKUQTYINPACK")
	public String getSkuquantityinpack() {
		return skuquantityinpack;
	}


	public void setSkuquantityinpack(String skuquantityinpack) {
		this.skuquantityinpack = skuquantityinpack;
	}	
	
	
}
