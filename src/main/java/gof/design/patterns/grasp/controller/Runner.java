package gof.design.patterns.grasp.controller;

public class Runner {

    public static void main(String[] args) {
        Controller controller = new Controller(5);

        // Submitting tasks up to the thread pool limit
        controller.process();
        controller.process();
        controller.process();
        controller.process();
        controller.process();

        // This call should block until at least one thread becomes available
        controller.process();
        controller.process();
        controller.process();
        controller.process();
        controller.process();
        controller.process();


        controller.shutdown();
    }

}
