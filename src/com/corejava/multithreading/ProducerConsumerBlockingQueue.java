package com.corejava.multithreading;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
 
/**
 * Producer1 Class in java.
 */
class Producer1 implements Runnable {
 
    private final BlockingQueue<Integer> sharedQueue;
 
    public Producer1(BlockingQueue<Integer> sharedQueue) {
        this.sharedQueue = sharedQueue;
    }
 
    @Override
    public void run() {
        for(int i=1; i<=10; i++){
         try {
             System.out.println("Produced : " + i);
             //put/produce into sharedQueue.
             sharedQueue.put(i);          
         } catch (InterruptedException ex) {
             
         }
        }
    }
 
}
 
/**
 * Consumer1 Class in java.
 */
class Consumer1 implements Runnable{
 
    private BlockingQueue<Integer> sharedQueue;
 
    public Consumer1 (BlockingQueue<Integer> sharedQueue) {
        this.sharedQueue = sharedQueue;
    }
 
    @Override
    public void run() {
        while(true){
         try {
           //take/consume from sharedQueue.
             System.out.println("CONSUMED : "+ sharedQueue.take());  
         } catch (InterruptedException ex) {
             
         }
        }
    }
 
 
}
 
/** Copyright (c), AnkitMittal JavaMadeSoEasy.com */
public class ProducerConsumerBlockingQueue {
 
    public static void main(String args[]){
     
     //Creating shared object  
     BlockingQueue<Integer> sharedQueue = new LinkedBlockingQueue<Integer>();
    
     Producer1 Producer1=new Producer1(sharedQueue);
     Consumer1 Consumer1=new Consumer1(sharedQueue);
    
     Thread Producer1Thread = new Thread(Producer1, "Producer1Thread");
     Thread Consumer1Thread = new Thread(Consumer1, "Consumer1Thread");
     Producer1Thread.start();
     Consumer1Thread.start();
 
    }
 
}