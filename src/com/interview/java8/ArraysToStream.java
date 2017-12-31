/**
 * 
 */
package com.interview.java8;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * @author Vir Pratap Uttam
 *
 */
public class ArraysToStream {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] arr={"a","b","c","d"};
		Stream<String> st=Arrays.stream(arr);
		st.forEach(System.out::println);
		
		Stream<String> s=Stream.of(arr);
		s.forEach(System.out::println);
	}

}
