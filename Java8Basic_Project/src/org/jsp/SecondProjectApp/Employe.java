package org.jsp.SecondProjectApp;

public class Employe {
	private int eid;
	private String name;
	private int age;
	private double sal;
	
	public Employe(int eid, String name, int age, double sal) {
		super();
		this.eid = eid;
		this.name = name;
		this.age = age;
		this.sal = sal;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Employe [eid=" + eid + ", name=" + name + ", age=" + age + ", sal=" + sal + "]";
	}
	
	

}
