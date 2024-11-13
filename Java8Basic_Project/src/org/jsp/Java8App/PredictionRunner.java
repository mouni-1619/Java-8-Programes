package org.jsp.Java8App;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredictionRunner {
	public static void main(String[] args) {
		Predicate<Integer> p1=(n1)->n1==11;
		System.out.println("----Predicate out put-----------");
		System.out.println(p1.test(10));
		System.out.println(p1.test(11));
		BiPredicate<Integer, Character> bp1=(age,gender)->age>=20 && gender=='F';
		System.out.println("----BiPredicate out put-----------");
		System.out.println(bp1.test(23, 'F'));
		System.out.println(bp1.test(20, 'F'));
		System.out.println(bp1.test(23, 'M'));
	}

}
