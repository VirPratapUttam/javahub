package com.scjp.thread;

import java.io.IOException;

public class ExceptionRun {
    public static void main(String[] args) {
           System.out.println("1 ");
           InnerClass i=new InnerClass();
           i.start();
           System.out.println("2 ");
    }
           
    static class InnerClass extends Thread{
           public void run()throws IOException{
                  throw new IOException();
           }
    }
}
