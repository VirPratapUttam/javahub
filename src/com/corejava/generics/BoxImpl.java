package com.corejava.generics;

public class BoxImpl {
	public static void main(String[] args) {
		Box<Integer> boxInteger=new Box<>();
		Box<String> boxString=new Box<>();
		boxInteger.setT(101);
		System.out.println(boxInteger.getT());
		boxString.setT("Vir");
		System.out.println(boxString.getT());
		
		Box rawBox=new Box();
		rawBox=boxString;
		System.out.println(rawBox.getT());
		
		
	}

}
