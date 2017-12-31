package com.corejava.file;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {

	public static void main(String[] args) {
		try {
			FileWriter fw=new FileWriter("xyz.txt",true);
			fw.write("Hello This is Vir a\n");
			fw.flush();
			fw.close();
			System.out.println(fw.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
