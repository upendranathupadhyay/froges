package com.collabration;

public class Flower 
{
	private String flname;
	private String ftype;
	public String getFlname() {
		return flname;
	}
	public void setFlname(String flname) {
		this.flname = flname;
	}
	public String getFtype() {
		return ftype;
	}
	public void setFtype(String ftype) {
		this.ftype = ftype;
	}
	@Override
	public String toString() {
		return "Flower [flname=" + flname + ", ftype=" + ftype + "]";
	}
	
	

}
