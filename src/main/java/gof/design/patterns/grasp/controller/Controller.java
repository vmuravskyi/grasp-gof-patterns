package gof.design.patterns.grasp.controller;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class Controller {

    private final ExecutorService executorService;
    private final Semaphore semaphore;

    public Controller(int threadPoolSize) {
        // Create a thread pool with the given size
        this.executorService = Executors.newFixedThreadPool(threadPoolSize);
        // Initialize semaphore with the same number of permits as the thread pool size
        this.semaphore = new Semaphore(threadPoolSize);
    }

    public void process() {
        long before = System.currentTimeMillis();
        try {
            // Acquire a permit, blocking if necessary until one is available
            semaphore.acquire();

            // Submit a new task to the executor service
            executorService.submit(() -> {
                try {
                    // Run the worker logic
                    Worker worker = new Worker();
                    worker.run();
                } finally {
                    // Release the permit after the task is completed
                    semaphore.release();
                }
            });
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        long after = System.currentTimeMillis();
        System.out.println("process took: " + (after - before));
    }

    public void shutdown() {
        executorService.shutdown();
    }

}
