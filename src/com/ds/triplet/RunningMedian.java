package com.ds.triplet;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;


public class RunningMedian {
	
    PriorityQueue<Integer> minPq = new PriorityQueue<>();
    PriorityQueue<Integer> maxPq = new PriorityQueue<>(Collections.reverseOrder());

	  public void addNum(int num) {
	        if (maxPq.size() == 0) {
	            maxPq.add(num);
	            return;
	        }
	        if (maxPq.size() == minPq.size()) {
	            if (minPq.peek() < num) {
	                maxPq.offer(minPq.poll());
	                minPq.offer(num);
	            } else {
	                maxPq.offer(num);
	            }
	        } else {
	            int toBeOffered = 0;
	            if (num >= maxPq.peek()) {
	                toBeOffered = num;
	            } else {
	                toBeOffered = maxPq.poll();
	                maxPq.offer(num);
	            }
	            minPq.offer(toBeOffered);
	        }
	    }
	    public double findMedian() {
	        if (minPq.size() == maxPq.size()) {
	            return ((double)minPq.peek() + (double)maxPq.peek())/2;
	        } else {
	            return maxPq.peek();
	        }
	    }

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		RunningMedian rm = new RunningMedian();
		for(int i=0;i<n;i++)
		{
			rm.addNum(sc.nextInt());
	        System.out.println(rm.findMedian());
		}
	}

}
