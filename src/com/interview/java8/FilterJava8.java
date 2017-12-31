package com.interview.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class PersonDetail<K, V> {
	private K key;
	private V name;

	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public V getName() {
		return name;
	}

	public void setName(V name) {
		this.name = name;
	}

}

class Person<T> {
	private T name;
	private T age;

	public Person(T age, T name) {
		this.name = name;
		this.age = age;
	}

	public T getName() {
		return name;
	}

	public void setName(T name) {
		this.name = name;
	}

	public T getAge() {
		return age;
	}

	public void setAge(T age) {
		this.age = age;
	}

}

class Item {
	private Integer key;
	private String name;

	public Item(Integer key, String name) {
		this.key = key;
		this.name = name;
	}

	public Integer getKey() {
		return key;
	}

	public void setKey(Integer key) {
		this.key = key;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

public class FilterJava8 {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Vir", "Raj", "Rohit");

		List<String> result = names.stream().filter(name -> !"Vir".equals(name)).collect(Collectors.toList());
		List<String> result1 = names.stream().filter(name -> !name.contains("s")).collect(Collectors.toList());

		result.forEach(System.out::println);
		result1.forEach(System.out::println);

		List<Person> list = Arrays.asList(new Person(1, "Vir"), new Person(2, "Raj"), new Person(3, "Rohit"));

		List<Person> person = list.stream().filter(p -> "Vir".equals(p.getName())).collect(Collectors.toList());
		System.out.println("After Filtering");
		person.forEach(p -> System.out.println(p.getName()));

		System.out.println("Find Any");
		Person pd = list.stream().filter(p -> "Vir".equals(p.getName())).findAny().orElse(null);
		System.out.println(pd.getName());

		System.out.println("Find Other");
		Person pd1 = list.stream().filter(p -> "Rik".equals(p.getName())).findAny().orElse(null);
		System.out.println(pd.getName());

		System.out.println("Multiple Condition");
		Person mp = list.stream().filter((p) -> "Vir".equals(p.getName()) || "Raj".equals(p.getName())).findAny()
				.orElse(null);
		System.out.println(mp.getName());

		List<Item> items = Arrays.asList(new Item(1, "Vir"), new Item(2, "Raj"), new Item(3, "Rohit"));
		System.out.println("Collect and Map");
		List<String> collect = items.stream().map(Item::getName).collect(Collectors.toList());
		collect.forEach(p->System.out.println(p));
		
		
		System.out.println("Filter & Map");
		String filterMapString=items.stream().filter(p->"Vir".equals(p.getName())).map(Item::getName).findAny().orElse(null);
		System.out.println(filterMapString);
		
		
	}
}
