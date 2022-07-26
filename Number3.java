package com.alyse.controller.Day6;
//thread synchronization

public class Number3 {

	 public void printCount() {
	      try {
	         for(int i = 5; i > 0; i--) {
	            System.out.println("Counter\t"  + i );
	         }
	      } catch (Exception e) {
	         System.out.println("Thread  interrupted.");
	      }
	   }
	}

	class ThreadDemo extends Thread {
	   private Thread t;
	   private String threadName;
	   Number3  n;

	   ThreadDemo( String name,  Number3 n) {
	      threadName = name;
	   }
	   
	   public void run() {
	      synchronized(n) {
	         n.printCount();
	      }
	      System.out.println("Thread " +  threadName + " exiting.");
	   }

	   public void start () {
	      System.out.println("Starting " +  threadName );
	      if (t == null) {
	         t = new Thread (this, threadName);
	         t.start ();
	      }
	   }
	}

	public class TestThread {

	   public static void main(String args[]) {
		   Number3 n = new Number3();

	      ThreadDemo T1 = new ThreadDemo( "Thread - 1 ", n);
	      ThreadDemo T2 = new ThreadDemo( "Thread ", n);

	      T1.start();
	      T2.start();

	      try {
	         T1.join();
	         T2.join();
	      } catch ( Exception e) {
	         System.out.println("Interrupted");
	      }
	   }
	}
