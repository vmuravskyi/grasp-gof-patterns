package gof.design.patterns.gof.momento.application;

import gof.design.patterns.gof.momento.texteditor.Caretaker;
import gof.design.patterns.gof.momento.texteditor.Originator;

public class Application {

    public static void main(String[] args) {

        Originator originator = new Originator();
        Caretaker careTaker = new Caretaker();

        originator.setState("First version");
        careTaker.addState(originator.save());

        originator.setState("Second version");
        careTaker.addState(originator.save());

        originator.setState("Third version");
        careTaker.addState(originator.save());

        originator.setState("Forth version");
        System.out.println("Current state: " + originator.getState());

        originator.restore(careTaker.getStateByIndex(0));
        System.out.println("First saved state: " + originator.getState());
        originator.restore(careTaker.getStateByIndex(1));
        System.out.println("Second saved state: " + originator.getState());
        originator.restore(careTaker.getStateByIndex(2));
        System.out.println("Third saved state: " + originator.getState());

    }

}
