package com.alyse.controller.Day6;
//create two threads(one even, one odd)

public class Number2 {
	int counter = 1;
    static int N;
  
    // Function to print odd numbers
    public void oddNumber() {
        synchronized (this){
            while (counter < N) {
            	while (counter % 2 == 0) {
                    try {
                        wait();
                    }catch (
                        InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.print(counter + " ");
                counter++;
                notify();
            }
        }
    }
    
    //function to print even number
    public void evenNumber(){
        synchronized (this){
            while (counter < N) {
            	while (counter % 2 == 1) {
            		try {
                        wait();
                    } catch (
                        InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                
                System.out.print(counter + " ");
                counter++;
                notify();
            }
        }
    }
            
	public static void main(String[] args) {
		 N = 10;
	     final Number2 mt = new Number2();

	     Thread t1 = new Thread(new Runnable() {
	    	 public void run() {
	            mt.evenNumber();
	         }
	     });
	     Thread t2 = new Thread(new Runnable() {
	    	 public void run() {
	                mt.oddNumber();
	         }
	     });

	     t1.start();
	     t2.start();   
	}

}
