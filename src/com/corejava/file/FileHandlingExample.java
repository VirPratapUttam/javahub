package com.corejava.file;

import java.io.File;
import java.io.IOException;

public class FileHandlingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f1= new File("abc.txt");
		System.out.println(f1.exists());
		try {
			f1.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(f1.exists());
		System.out.println(f1.length());
		System.out.println(f1.isFile());
		System.out.println(f1.isDirectory());
		System.out.println(f1.getAbsolutePath());
		
		File f2=new File("C:\\workspace\\new_Practice\\src\\com\\corejava\\enumpractice");
		String[] st=f2.list();
		for(String s:st)
		{
			System.out.println(s);
		}
		
		//File f3=new File()
	}

}
