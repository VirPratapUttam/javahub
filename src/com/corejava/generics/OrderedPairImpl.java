package com.corejava.generics;

public class OrderedPairImpl {
	public static void main(String[] args) {
		OrderedPair<Integer, String> o1=new OrderedPair<>(1,"Vir");
		System.out.println(o1.getKey()+"  "+o1.getValue());
		
		OrderedPair<String,String> o2=new OrderedPair<>("name","Mona");
		System.out.println(o2.getKey()+" "+o2.getValue());
		
		OrderedPair<String,Box<Integer>> o3=new OrderedPair<>("box", new Box<Integer>());
		Box<Integer> b=new Box<>();
		b.setT(10);
		o3.setValue(b);
		System.out.println(o3.getKey()+" "+o3.getValue().getT());
	}
}
