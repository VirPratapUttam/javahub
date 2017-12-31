package com.corejava.generics;

public class BoundedType<T> {
	private T t;

	public void set(T t) {
		this.t = t;
	}

	public T get() {
		return t;
	}

	public static void main(String[] args) {
		BoundedType<Integer> b=new BoundedType<>();
	//	b.boundedTest("test"); Compilation error
		b.boundedTest(10);
	}

	private <U extends Number> void boundedTest(U u) {
		System.out.println(u);
	}

}
