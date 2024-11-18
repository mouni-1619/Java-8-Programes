package org.jsp.FistProjectApp;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class PrintEmployeInMap {
	public static void main(String[] args) {
		List<Employee> li=EmployeeServise.getAll();
	Predicate<Employee> p=(e)->{
		return e.getAge()>=26;
	};
	Predicate<Employee> p1=(e)->{
		return e.getEsal()>=30000;
	};
	
	Function<List<Employee>, Map<Integer, String>> f=(l)->{
		Map<Integer,String> m=new LinkedHashMap<Integer, String>();
		l.forEach((o)->{
			if(p.and(p1).test(o)) {
				m.put(o.getEid(), o.getEname());
			}
		});
		return m;
	};
	System.out.println(f.apply(li));
	}

}
