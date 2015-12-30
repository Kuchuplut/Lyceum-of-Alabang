package com.lyceum.model;

import java.util.Date;

public class Person {

	private Name name;
	private Address address;
	private long birthday;
	private String strGender;
	public Name getName() {
		return name;
	}
	public void setName(Name name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Date getBirthday() {
		return new Date(birthday);
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday.getTime();
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + (int) (birthday ^ (birthday >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result
				+ ((strGender == null) ? 0 : strGender.hashCode());
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
		if (!(obj instanceof Person)) {
			return false;
		}
		Person other = (Person) obj;
		if (address == null) {
			if (other.address != null) {
				return false;
			}
		} else if (!address.equals(other.address)) {
			return false;
		}
		if (birthday != other.birthday) {
			return false;
		}
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		if (strGender == null) {
			if (other.strGender != null) {
				return false;
			}
		} else if (!strGender.equals(other.strGender)) {
			return false;
		}
		return true;
	}
	public String getStrGender() {
		return strGender;
	}
	public void setStrGender(String strGender) {
		this.strGender = strGender;
	}
	
	public String toString(){
		return getName()+" -- "+getBirthday();
	}
	
}