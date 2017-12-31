package com.ds.triplet;

import java.util.PriorityQueue;
import java.util.Scanner;

public class JesseNCookies {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int maxSweetness=sc.nextInt();
		int count = 0;
		PriorityQueue<Integer> q = new PriorityQueue<Integer>();
	    for(int i = 0; i < n; i++){
	        q.add(sc.nextInt());
	    }
	    while(q.peek() < maxSweetness && q.size() >= 2){
	        q.add(q.remove() + 2 * q.remove());   
	        count++;
	    }

	    if(q.size() == 1 && q.peek() < maxSweetness){
	        count = -1;
	    }
	    System.out.println(count); 
		sc.close();
	}

}
