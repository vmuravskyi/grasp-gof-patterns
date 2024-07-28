package gof.design.patterns.grasp.controller;

public class Worker implements Runnable {

    public void run() {
        try {
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + " is executing Task1.");
            Thread.sleep(2000); // Simulate work with a 2-second delay
            System.out.println(threadName + " finishing Task1.");
            System.out.println(threadName + " is executing Task2.");
            Thread.sleep(2000); // Simulate work with another 2-second delay
            System.out.println(threadName + " finishing Task2.");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

}
