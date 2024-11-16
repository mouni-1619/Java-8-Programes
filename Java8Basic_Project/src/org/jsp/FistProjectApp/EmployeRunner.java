package org.jsp.FistProjectApp;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class EmployeRunner {
	public static void main(String[] args) {
		List<Employee> li=EmployeeServise.getAll();
		System.out.println("-----------iterating Advanced for----------------");
		//list elements iterating Advanced For loop
		for(Employee e:li) {
			System.out.println(e);
		}
		System.out.println("----------------iterating forEach----------------");
		//list elements iterating forEach Loop
		//all information
		li.forEach((e)->{
			System.out.println(e);
		});
		//only Names
		Consumer<Employee> c1=(e)->{System.out.println(e.getEname());};
		System.out.println("----------------iterating only names----------------");
		li.forEach(c1);
		//all ages
		Consumer< Employee> c2=(e)->{
			System.out.println(e.getAge());
		};
		//all disgination
		Consumer<Employee> c3=(e)->{
			System.out.println(e.getEdisg());
		};
		Consumer<Employee> c4=(e)->{
			System.out.println(e);
		};
		System.out.println("----------------iterating one by one use andThan method----------------");
		li.forEach(c1.andThen(c2).andThen(c3));
		System.out.println("----------------iterating only >=30----------------");
		Predicate<Employee> p=(e)->{
			return e.getAge()>=30;
		};
		li.forEach((e)->{
			if(p.test(e)) {
				c4.accept(e);
			}
		});
		System.out.println("-----if age is grater then 30 sall incres 20%---------");
		Function<Employee, Double> f=(n)->{
			return n.getEsal()*0.2+n.getEsal();
		};
		li.forEach((e)->{
			
			if(p.test(e)) {
				c1.accept(e);
				System.out.println(f.apply(e));
			}
		});

	}
	}


