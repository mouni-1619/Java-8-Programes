package org.jsp.MethodReferancesApp;

import java.util.function.Function;

public class StaticMethodReferances {
	static void show() {
		System.out.println("Hi Mounika How Are you");
	}
	static int add(int n1,int n2) {
		return n1+n2;
	}
	static int sub(int n1,int n2) {
		return n1-n2;
	}
public static void main(String[] args) {
	// i create my own interfaces use lamida Expresion
	Display d1=()->{show();};
	System.out.println("Disply Interface perfamance");
	d1.Disply();
	//use Static method referance
	Display d2=StaticMethodReferances::show;
	d2.Disply();
	System.out.println("Functional Interface perfamence");
	Function<Integer, Double> f1=(n)->{
		return Math.sqrt(n);
	};
	System.out.println(f1.apply(25));
	Function<Integer, Double> f2=Math::sqrt;
	System.out.println(f2.apply(25));
	System.out.println("Calculation interface perfamences");
	Calculation c=(n1,n2)->{
		return add(n1,n2);
	};
	Calculation c1=StaticMethodReferances::add;
	Calculation c2=StaticMethodReferances::sub;
	System.out.println(c.calc(10, 45));
	System.out.println(c1.calc(10, 45));
	System.out.println(c2.calc(100, 45));
}
}
