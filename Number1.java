package com.alyse.controller.Day6;
//printing from threads

public class Number1 {

	private static final Object lock = new Object();
    private static int numThreads = 3;
    private static int printNum = 50;
    private static int counter = 1;

    public static void main(String[] args) {
        if (args.length > 0) {
            try {
            	numThreads = Integer.parseInt(args[0]);
            	printNum = Integer.parseInt(args[1]);
            } catch (NumberFormatException e) {
                System.err.println("Arguments must be an integer.");
                System.exit(1);
            }
        }
        
        for (int i = 1; i <= numThreads; i++) {
            new Thread(new Generator(i % numThreads), "T" + i).start();
        }
    }

    static class Generator implements Runnable {

        private int remainder;
        Generator(int remainder) {
            this.remainder = remainder;
        }

        public void run() {
            while (counter <= printNum) {
                synchronized (lock) {
                    while (counter % numThreads != remainder) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    if (counter % numThreads == remainder && 
                            counter <= printNum) {
                        System.out.println(counter);
                    }
                    counter++;
                    lock.notifyAll();
                }
            }
        }
    }
}
