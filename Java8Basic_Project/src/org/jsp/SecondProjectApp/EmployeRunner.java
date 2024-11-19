package org.jsp.SecondProjectApp;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeRunner {
public static void main(String[] args) {
	List<Employe> l=EmployeList.getList();
	//covert name in UperCase and return in list of names
	List<String> l2=l.stream().map((e)->e.getName().toUpperCase()).collect(Collectors.toList());
	System.out.println(l2);
	//Creating map in employ id and sale and increasing
	Map<Integer,Double> m=l.stream().map((e)->{
		e.setName(e.getName().toUpperCase());
		e.setSal(e.getSal()+10000);
		return e;
	}).collect(Collectors.toMap(e->e.getEid(),e->e.getSal()));
	System.out.println(m);
	//List Employe Name in Uppercase format
	List<Employe>l3=l.stream().map((e)->{
		e.setName(e.getName().toUpperCase());
		
		return e;
	}).collect(Collectors.toList());
	l3.forEach((e)->System.out.println(e));
	//Pring employe age >=30
	System.out.println("===================use Filter in Stream=======");
l.stream().filter((e)->e.getAge()>30).forEach((e)->System.out.println(e));
}
}
