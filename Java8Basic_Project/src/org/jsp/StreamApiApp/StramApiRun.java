package org.jsp.StreamApiApp;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StramApiRun {
	public static void main(String[] args) {
		
	
List<Integer> l=Arrays.asList(10,26,19,30,50,99);
List<Integer>l1=l.stream().map((e)->e*10).collect(Collectors.toList());
System.out.println("Stream use toList() ");
System.out.println(l1);

List<Integer> l2=Arrays.asList(12,10,25,23,16,10,30,60);
Set<Integer> s1=l2.stream().map((n)->n+10).collect(Collectors.toSet());
System.out.println("Stream use toSet() ");
System.out.println(s1);

List<String > l3=Arrays.asList("RCB","CSK","SRH","MI","KKR","GT");
Map<Character, String> m1=l3.stream().map((a)->a.toLowerCase()).collect(Collectors.toMap((s)->s.charAt(0), s->s));
System.out.println("Stream use toMap()");
System.out.println(m1);
	}
}
