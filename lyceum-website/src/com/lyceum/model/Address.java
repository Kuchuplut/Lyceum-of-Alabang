package com.lyceum.model;

public class Address {

	private String strHouseNo;
	private String strStreet;
	private String strBarangay;
	private String strSubdivision;
	private String strCity;
	private String strProvince;
	
	public String getStrHouseNo() {
		return strHouseNo;
	}

	public void setStrHouseNo(String strHouseNo) {
		this.strHouseNo = strHouseNo;
	}

	public String getStrStreet() {
		return strStreet;
	}

	public void setStrStreet(String strStreet) {
		this.strStreet = strStreet;
	}

	public String getStrBarangay() {
		return strBarangay;
	}

	public void setStrBarangay(String strBarangay) {
		this.strBarangay = strBarangay;
	}

	public String getStrSubdivision() {
		return strSubdivision;
	}

	public void setStrSubdivision(String strSubdivision) {
		this.strSubdivision = strSubdivision;
	}

	public String getStrCity() {
		return strCity;
	}

	public void setStrCity(String strCity) {
		this.strCity = strCity;
	}

	public String getStrProvince() {
		return strProvince;
	}

	public void setStrProvince(String strProvince) {
		this.strProvince = strProvince;
	}
	
	public String getFullAddress(){
		String strAddress = getStrHouseNo()+" "+getStrStreet()+" "+getStrSubdivision()+" "+getStrBarangay()+", "+getStrCity()+", "+getStrProvince();
		return strAddress.trim();
	}
	
}
