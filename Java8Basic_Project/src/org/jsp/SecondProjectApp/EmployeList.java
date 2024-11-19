package org.jsp.SecondProjectApp;

import java.util.Arrays;
import java.util.List;

import org.jsp.FistProjectApp.Employee;

public class EmployeList {
	static List<Employe> getList(){
		Employe e1=new Employe(1, "Sindhu", 25, 27000);
		Employe e2=new Employe(2, "Hari", 27, 35000);
		Employe e3=new Employe(3, "Arish", 28, 50000);
		Employe e4=new Employe(4, "Bobby", 30, 300000);
		Employe e5=new Employe(5, "Surekha", 32, 37000);
		Employe e6=new Employe(6, "Vahini", 33, 90000);
		List<Employe> li=Arrays.asList(e1,e2,e3,e4,e5,e6);
		return li;
		
	}

}
