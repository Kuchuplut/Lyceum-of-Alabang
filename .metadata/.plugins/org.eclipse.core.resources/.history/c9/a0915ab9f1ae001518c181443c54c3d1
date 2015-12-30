package com.lyceum.model;

public class Address {

	private String strHouseNo;
	private String strStreet;
	private String strBarangay;
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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((strBarangay == null) ? 0 : strBarangay.hashCode());
		result = prime * result + ((strCity == null) ? 0 : strCity.hashCode());
		result = prime * result
				+ ((strHouseNo == null) ? 0 : strHouseNo.hashCode());
		result = prime * result
				+ ((strProvince == null) ? 0 : strProvince.hashCode());
		result = prime * result
				+ ((strStreet == null) ? 0 : strStreet.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Address)) {
			return false;
		}
		Address other = (Address) obj;
		if (strBarangay == null) {
			if (other.strBarangay != null) {
				return false;
			}
		} else if (!strBarangay.equals(other.strBarangay)) {
			return false;
		}
		if (strCity == null) {
			if (other.strCity != null) {
				return false;
			}
		} else if (!strCity.equals(other.strCity)) {
			return false;
		}
		if (strHouseNo == null) {
			if (other.strHouseNo != null) {
				return false;
			}
		} else if (!strHouseNo.equals(other.strHouseNo)) {
			return false;
		}
		if (strProvince == null) {
			if (other.strProvince != null) {
				return false;
			}
		} else if (!strProvince.equals(other.strProvince)) {
			return false;
		}
		if (strStreet == null) {
			if (other.strStreet != null) {
				return false;
			}
		} else if (!strStreet.equals(other.strStreet)) {
			return false;
		}
		return true;
	}
	@Override
	public String toString() {
		return getStrHouseNo()+" "+getStrStreet()+" "+getStrBarangay()+", "+
				getStrCity()+", "+getStrProvince();
	}
	
}
