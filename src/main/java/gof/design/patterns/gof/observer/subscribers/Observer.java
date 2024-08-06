package gof.design.patterns.gof.observer.subscribers;

import gof.design.patterns.gof.observer.states.Message;

public interface Observer {

    void update(Message message);

    int getMinimumWarningLevel();

}
