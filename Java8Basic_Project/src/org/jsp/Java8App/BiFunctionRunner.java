package org.jsp.Java8App;

import java.util.function.BiFunction;

public class BiFunctionRunner {
public static void main(String[] args) {
	BiFunction<Integer, Double, String> b1=(n1,n2)->{
		return n1>n2?"hello":"Bye";
	};
	System.out.println(b1.apply(10, 3.3));
}
}
