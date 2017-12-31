package com.interview.java8;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterNullFromStream {

	public static void main(String[] args) {
		Stream<String> languages=Stream.of("Vir","Ran","Ravi","Suresh",null,"Laddu");
		List<String> collect=languages.filter(x->x!=null).collect(Collectors.toList());
		collect.forEach(System.out::println);
		
		//Alternate 
	//	List<String> collect1=languages.filter(Objects::notNull).collect(Collectors.toList());
	}

}
