package com.interview.java8;

import java.util.Optional;

public class OptionalBasicExample {

	public static void main(String[] args) {
		Optional<String> gender=Optional.of("MALE");
		String answer1="Yes";
		String answer2=null;
		
		System.out.println("Optional : "+gender);
		System.out.println("Opotional Value :"+gender.get());
		System.out.println("Optional empty :-"+gender.empty());
		
		System.out.println("Optional:ofNullable "+gender.ofNullable(value));
	}

}
