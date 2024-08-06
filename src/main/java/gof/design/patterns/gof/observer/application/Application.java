package gof.design.patterns.gof.observer.application;

import gof.design.patterns.gof.observer.subjects.Storm;
import gof.design.patterns.gof.observer.subscribers.AirportObserver;
import gof.design.patterns.gof.observer.subscribers.Observer;
import gof.design.patterns.gof.observer.subscribers.RoadServiceObserver;
import gof.design.patterns.gof.observer.subscribers.SchoolObserver;

import java.util.ArrayList;

public class Application {

    public static void main(String[] args) {
        var observers = new ArrayList<Observer>(3);
        observers.add(new AirportObserver("Zhuliany"));
        observers.add(new SchoolObserver("Primary School Stockton"));
        observers.add(new RoadServiceObserver("Alabama road service"));

        var hurricaneKatherine = new Storm("Hurricane Katherine", 5);
        observers.forEach(hurricaneKatherine::attach);

        hurricaneKatherine.notifyUpdate("First storm alarm");
        System.out.println("*****************************");
        hurricaneKatherine.detach(observers.get(1));
        hurricaneKatherine.notifyUpdate("Second storm alarm");
    }

}
