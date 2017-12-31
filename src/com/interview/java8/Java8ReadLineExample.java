package com.interview.java8;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8ReadLineExample {

	public static void main(String[] args) {
		String fileName = "c://lines.txt";
		List<String> l1=new ArrayList<>();
		List<String> l2=new ArrayList<>();

		//read file into stream, try-with-resources
		try(Stream<String> stream=Files.lines(Paths.get(fileName)))
		{
			//stream.forEach(System.out::println);
			l1=stream.filter(line->!line.startsWith("line3")).map(String::toUpperCase).collect(Collectors.toList());
			l1.forEach(System.out::println);
		}catch(IOException e)
		{
			e.printStackTrace();
		}
		
		try (BufferedReader br = Files.newBufferedReader(Paths.get(fileName))) {

			//br returns as stream and convert it into a List
			l2 = br.lines().collect(Collectors.toList());

		} catch (IOException e) {
			e.printStackTrace();
		}

		l2.forEach(System.out::println);
		
		/*
		try (Stream<String> stream = Files.lines(Paths.get(fileName))) {

			stream.forEach(System.out::println);

		} catch (IOException e) {
			e.printStackTrace();
		}*/
	}

}
