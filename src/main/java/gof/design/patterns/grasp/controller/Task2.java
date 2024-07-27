package gof.design.patterns.grasp.controller;

public class Task2 {

    public void execute() throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " is executing Task2.");
        // Task2 logic here
        Thread.sleep(2000);
        System.out.println(Thread.currentThread().getName() + " finishing Task2.");
    }

}
