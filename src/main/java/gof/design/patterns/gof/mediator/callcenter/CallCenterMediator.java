package gof.design.patterns.gof.mediator.callcenter;

import gof.design.patterns.gof.mediator.people.Worker;

public interface CallCenterMediator {

    void send(CallCenterCommand command, String msg);

    void addWorker(Worker worker);

}
