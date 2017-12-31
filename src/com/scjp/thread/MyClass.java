package com.scjp.thread;

class Class2 {
    void method2(String name) {
           for (int x = 1; x <=2; x++) {
                  System.out.println(Thread.currentThread().getName());
           }
    }
}
 
public class MyClass implements Runnable {
    static Class2 obj2;
 
    public static void main(String[] args) {
           new MyClass().method1();
    }
 
    void method1() {
           obj2 = new Class2();
           new Thread(new MyClass()).start();
           new Thread(new MyClass()).start();
    }
 
    public void run() {
           obj2.method2(Thread.currentThread().getName());
    }
}
