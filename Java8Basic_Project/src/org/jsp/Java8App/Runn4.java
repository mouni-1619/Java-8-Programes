package org.jsp.Java8App;

public class Runn4 {
public static void main(String[] args) {
	FunDemo3 f=()->"hello"+67;
	System.out.println(f.Return());
	FunDemo3 f1=()->{
		System.out.println("hii"+88888);
		return "hello";
	};
	System.out.println(f1.Return());
}
}
