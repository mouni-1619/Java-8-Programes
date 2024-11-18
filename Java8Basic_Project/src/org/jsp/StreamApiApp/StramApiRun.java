package org.jsp.StreamApiApp;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StramApiRun {
	public static void main(String[] args) {
		
	
List<Integer> l=Arrays.asList(10,26,19,30,50,99);
List<Integer>l1=l.stream().map((e)->e*10).collect(Collectors.toList());
System.out.println(l1);
	}
}
