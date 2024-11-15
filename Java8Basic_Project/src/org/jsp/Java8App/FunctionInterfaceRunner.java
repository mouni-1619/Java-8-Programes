package org.jsp.Java8App;

import java.util.function.Function;

public class FunctionInterfaceRunner {
	public static void main(String[] args) {
		Function f1=(n)->n+" hello";
		System.out.println(f1.apply(10));
		Function<Integer, String> f2=(n)->{
			if(n%2==0) {
				n=n*100;
			}else {
				n=n*200;
			}
			return "ans:"+n;
			
		};
		System.out.println(f2.apply(25));
		System.out.println(f2.apply(10));
		Function<Integer, Double> f3=(n)->n+10.0;
		System.out.println(f3.apply(6));
			
		
	}

}
