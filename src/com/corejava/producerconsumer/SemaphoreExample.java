package com.corejava.producerconsumer;

import java.util.concurrent.Semaphore;
class DecrementThread<T> implements Runnable{
	 
    T semaphore;
    public DecrementThread(T s){
           semaphore=s;
    }
    
    public void run(){
           System.out.println(Thread.currentThread().getName()+
                        " is waiting for permit");
           
           try {
                  ((Semaphore) semaphore).acquire();
                  System.out.println(Thread.currentThread().getName()+
                               " has got permit");
           
                  for(int i=0;i<5;i++){          
                        Thread.sleep(1000);
                        System.out.println(Thread.currentThread().getName()+
                                      " >"+SemaphoreExample.sharedValue--);
                  }
                  
           } catch (InterruptedException e) {
                  e.printStackTrace();
           }
           
           
           System.out.println(Thread.currentThread().getName()+
                        " has released permit");
           ((Semaphore) semaphore).release();
           
           
    }
    
}

class IncrementThread<T> implements Runnable
{
	T semaphore;
    
    public IncrementThread(T s) {
           semaphore=s;      
    }
    
    public void run(){
           System.out.println(Thread.currentThread().getName()+
                        " is waiting for permit");
           try {
                  ((Semaphore) semaphore).acquire();
                  System.out.println(Thread.currentThread().getName()+
                               " has got permit");
           
                  for(int i=0;i<5;i++){
                        Thread.sleep(1000);
                        System.out.println(Thread.currentThread().getName()+
                                      " > "+SemaphoreExample.sharedValue++);
                  }
                  
           } catch (InterruptedException e) {
                  e.printStackTrace();
           }
           
           System.out.println(Thread.currentThread().getName()+
                        " has released permit");
           ((Semaphore) semaphore).release();
    
    }
}
public class SemaphoreExample {

	static int sharedValue=0;
	public static void main(String[] args) {
		Semaphore semaphore=new Semaphore(1); 
        System.out.println("Semaphore with 1 permit has been created");

        
        IncrementThread incrementThread=new IncrementThread(semaphore);
        new Thread(incrementThread,"incrementThread").start();
        
        DecrementThread decrementThread=new DecrementThread(semaphore);
        new Thread(decrementThread,"decrementThread").start();
		
		
	}

}
