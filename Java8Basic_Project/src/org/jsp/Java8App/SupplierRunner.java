package org.jsp.Java8App;

import java.util.function.Supplier;

public class SupplierRunner {
	public static void main(String[] args) {
		Supplier s1=()->Math.random()*10;
		System.out.println(s1.get());
		System.out.println(s1.get());
		Supplier s2=()->"hello hi";
		System.out.println(s2.get());
		Supplier<Integer> s3=()->10;
		System.out.println(s3.get());
	}

}
