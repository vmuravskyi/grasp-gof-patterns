package gof.design.patterns.grasp.controller;

import java.util.concurrent.*;

public class Controller {

    private final BlockingQueue<Integer> pool;
    private final ThreadPoolExecutor executor;

    public Controller(int threadPool) {
        this.pool = new ArrayBlockingQueue<>(threadPool);
        this.executor = new ThreadPoolExecutor(
                threadPool,         // core pool size
                threadPool,         // maximum pool size
                0L, TimeUnit.MILLISECONDS,   // keep-alive time
                new LinkedBlockingQueue<>()   // task queue
        );

        // Pre-fill the pool with available permits
        for (int i = 0; i < threadPool; i++) {
            pool.add(i);
        }
    }

    public void process() {
        try {
            // Take a permit from the pool, blocking if none are available
            pool.take();
            executor.submit(() -> {
                try {
                    new WorkerThread().run();
                } finally {
                    // Return the permit to the pool after the task is done
                    try {
                        pool.put(1);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            });
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new RuntimeException(e);
        }
    }

    public void shutdown() {
        executor.shutdown();
    }

}
