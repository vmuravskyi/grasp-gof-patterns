package gof.design.patterns.gof.observer.subjects;

import gof.design.patterns.gof.observer.subscribers.Observer;

public interface IObservable {

    void attach(Observer observer);

    void detach(Observer observer);

    void notifyUpdate(String message);

}
