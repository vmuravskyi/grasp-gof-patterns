package gof.design.patterns.grasp.controller;

public class WorkerThread implements Runnable {

    @Override
    public void run() {
        Worker worker = new Worker();
        worker.work();
    }

}
