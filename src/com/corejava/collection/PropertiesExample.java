package com.corejava.collection;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertiesExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileReader fr=new FileReader("db.properties");
			Properties p=new Properties();
			p.load(fr);
			System.out.println(p.getProperty("user")+"   "+p.getProperty("password"));
			
			Properties p1=System.getProperties();
			p1.entrySet().forEach(p2->System.out.println(p2.getKey()+" "+p2.getValue()));
			
			Properties p2=new Properties();
			p2.setProperty("name", "vir");
			p2.setProperty("age", "35");
			p2.store(new FileWriter("test.properties"), "Testing the Setting");
			
			
		
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
