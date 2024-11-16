package org.jsp.FistProjectApp;

import java.util.List;

public class Employee {
	private int eid;
	private String ename;
	private double esal;
	private String edisg;
	private int age;
	private List<String> skils;
	
	public Employee(int eid, String ename, double esal, String edisg, int age, List<String> skils) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
		this.edisg = edisg;
		this.age = age;
		this.skils = skils;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getEsal() {
		return esal;
	}
	public void setEsal(double esal) {
		this.esal = esal;
	}
	public String getEdisg() {
		return edisg;
	}
	public void setEdisg(String edisg) {
		this.edisg = edisg;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public List<String> getSkils() {
		return skils;
	}
	public void setSkils(List<String> skils) {
		this.skils = skils;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", esal=" + esal + ", edisg=" + edisg + ", age=" + age
				+ ", skils=" + skils + "]";
	}
	

}
