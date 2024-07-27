package gof.design.patterns.grasp.controller;

public class Worker {

    public void work() {
        System.out.println(Thread.currentThread().getName() + " is working.");
        Task1 task1 = new Task1();
        Task2 task2 = new Task2();
        try {
            task1.execute();
            task2.execute();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // Add more tasks as needed
    }

}
