package com.obj.jgObj;

import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class PurchaseOrder {
	private String ordernumber;
	private String ordertype;
	private String orderstatus;
	private String brand;
	private String warehouseno;
	private String lineno;
	private String contactno;
	private String subcategory;
	private String gendercode;
	private String fabriccode;
	private String suppliercode;
	private String suppliername;
	private String podate;
	private String exfactorydate;
	private String shipnotbefore;
	private String shipnotafter;
	private String fobcost;
	private String currencycode;
	private String totalquantity;
	private String totalfob;
	private String freightmode;
	
	private List<PurchaseOrderDetail> podetail;
	private List<PurchaseOrderPackDetail> popackdetail;
	
	public PurchaseOrder() {}

	@XmlElement(name="ORDERNUMBER")
	public String getOrdernumber() {
		return ordernumber;
	}

	public void setOrdernumber(String ordernumber) {
		this.ordernumber = ordernumber;
	}

	@XmlElement(name="ORDERTYPE")
	public String getOrdertype() {
		return ordertype;
	}

	public void setOrdertype(String ordertype) {
		this.ordertype = ordertype;
	}

	@XmlElement(name="ORDERSTATUS")
	public String getOrderstatus() {
		return orderstatus;
	}

	public void setOrderstatus(String orderstatus) {
		this.orderstatus = orderstatus;
	}
	@XmlElement(name="BRAND")
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	@XmlElement(name="WAREHOUSENO")
	public String getWarehouseno() {
		return warehouseno;
	}

	public void setWarehouseno(String warehouseno) {
		this.warehouseno = warehouseno;
	}
	@XmlElement(name="LINENO")
	public String getLineno() {
		return lineno;
	}

	public void setLineno(String lineno) {
		this.lineno = lineno;
	}
	@XmlElement(name="CONTACTNO")
	public String getContactno() {
		return contactno;
	}

	public void setContactno(String contactno) {
		this.contactno = contactno;
	}
	@XmlElement(name="SUBCATEGORY")
	public String getSubcategory() {
		return subcategory;
	}

	public void setSubcategory(String subcategory) {
		this.subcategory = subcategory;
	}
	@XmlElement(name="GENDERCODE")
	public String getGendercode() {
		return gendercode;
	}

	public void setGendercode(String gendercode) {
		this.gendercode = gendercode;
	}
	@XmlElement(name="FABRICCODE")
	public String getFabriccode() {
		return fabriccode;
	}

	public void setFabriccode(String fabriccode) {
		this.fabriccode = fabriccode;
	}
	@XmlElement(name="SUPPLIERCODE")
	public String getSuppliercode() {
		return suppliercode;
	}

	public void setSuppliercode(String suppliercode) {
		this.suppliercode = suppliercode;
	}
	@XmlElement(name="SUPPLIERNAME")
	public String getSuppliername() {
		return suppliername;
	}

	public void setSuppliername(String suppliername) {
		this.suppliername = suppliername;
	}
	@XmlElement(name="PODATE")
	public String getPodate() {
		return podate;
	}

	public void setPodate(String podate) {
		this.podate = podate;
	}
	@XmlElement(name="EXFACTORYDATE")
	public String getExfactorydate() {
		return exfactorydate;
	}

	public void setExfactorydate(String exfactorydate) {
		this.exfactorydate = exfactorydate;
	}
	@XmlElement(name="SHIPNOTBEFORE")
	public String getShipnotbefore() {
		return shipnotbefore;
	}

	public void setShipnotbefore(String shipnotbefore) {
		this.shipnotbefore = shipnotbefore;
	}
	@XmlElement(name="SHIPNOTAFTER")
	public String getShipnotafter() {
		return shipnotafter;
	}

	public void setShipnotafter(String shipnotafter) {
		this.shipnotafter = shipnotafter;
	}
	@XmlElement(name="FOBCOST")
	public String getFobcost() {
		return fobcost;
	}

	public void setFobcost(String fobcost) {
		this.fobcost = fobcost;
	}
	@XmlElement(name="CURRENCYCODE")
	public String getCurrencycode() {
		return currencycode;
	}

	public void setCurrencycode(String currencycode) {
		this.currencycode = currencycode;
	}
	@XmlElement(name="TOTALQUANTITY")
	public String getTotalquantity() {
		return totalquantity;
	}

	public void setTotalquantity(String totalquantity) {
		this.totalquantity = totalquantity;
	}
	@XmlElement(name="TOTALFOB")
	public String getTotalfob() {
		return totalfob;
	}

	public void setTotalfob(String totalfob) {
		this.totalfob = totalfob;
	}
	@XmlElement(name="FREIGHTMODE")
	public String getFreightmode() {
		return freightmode;
	}

	public void setFreightmode(String freightmode) {
		this.freightmode = freightmode;
	}
	@XmlElement(name="DETAIL")
	public List<PurchaseOrderDetail> getPodetail() {
		return podetail;
	}

	public void setPodetail(List<PurchaseOrderDetail> podetail) {
		this.podetail = podetail;
	}
	@XmlElement(name="PACKDETAIL")
	public List<PurchaseOrderPackDetail> getPopackdetail() {
		return popackdetail;
	}

	public void setPopackdetail(List<PurchaseOrderPackDetail> popackdetail) {
		this.popackdetail = popackdetail;
	}
	
}
