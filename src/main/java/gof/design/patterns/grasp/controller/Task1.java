package gof.design.patterns.grasp.controller;

public class Task1 {

    public void execute() throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " is executing Task1.");
        // Task1 logic here
        System.out.println(Thread.currentThread().getName() + " finishing Task1.");
    }

}
