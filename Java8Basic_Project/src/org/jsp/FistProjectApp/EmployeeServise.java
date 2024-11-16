package org.jsp.FistProjectApp;

import java.util.Arrays;
import java.util.List;

public class EmployeeServise {
	static List<Employee> getAll(){
	Employee e1=new Employee(101, "Hari", 25000.0, "Farmer", 27, Arrays.asList("Farming","Driveing","clivi"));
	Employee e2=new Employee(102, "Arish", 35000.0, "Electrician", 28,Arrays.asList("Electri","Farming"));
	Employee e3=new Employee(103, "Bobby", 300000, "Devopes Eng", 30, Arrays.asList("Devopes","Sql","MongoDB","Linex","Aqua Clacher"));
	Employee e4=new Employee(104, "Sindhu",18000, "non it Work", 25, Arrays.asList("Typing","MS word","MSXL"));
	Employee e5=new Employee(105, "Rekha", 27000, "Lecharer", 32, Arrays.asList("Mathemates","physis","Typing"));
	Employee e6=new Employee(106, "Vahini",90000,"Software", 33,Arrays.asList("Devopes","AWS","SQL","HTML"));
	List<Employee> li=Arrays.asList(e1,e2,e3,e4,e5,e6);
	return li;
	}
}
