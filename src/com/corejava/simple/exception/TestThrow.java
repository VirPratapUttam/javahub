package com.corejava.simple.exception;

public class TestThrow {
	static void validate(int age) throws InvalidAgeException {
		if (age < 18)
			throw new InvalidAgeException("Invalid Age");
		else
			System.out.println("Ok");
	}

	public static void main(String[] args) {
		try {
			validate(13);
		} catch (InvalidAgeException e) {
			e.printStackTrace();
		}
	}

}
