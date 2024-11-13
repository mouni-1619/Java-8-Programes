package org.jsp.Java8App;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerRunner {
	public static void main(String[] args) {
		//Consumer take only one arguments
		Consumer c1=(n)->{
			System.out.println("hello"+n);};
		c1.accept(10);
		Consumer<String> c2=(s)->{
			System.out.println("Hi my name is "+s);
		};
		c2.accept("Mounika");
		//BiConsume cant take two arguments
		BiConsumer b1=(n1,n2)->{
			System.out.println("Sum: "+n1+n2);
		};
		b1.accept(10, "hii");
		BiConsumer<Integer, Double> b2=(n1,n2)->{
			System.out.println("Difference is: "+(n1-n2));
			System.out.println("sum: "+(n1+n2));
		};
		b2.accept(10, 3.66);
	}

}
