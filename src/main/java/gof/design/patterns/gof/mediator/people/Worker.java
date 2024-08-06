package gof.design.patterns.gof.mediator.people;

import gof.design.patterns.gof.mediator.callcenter.CallCenterCommand;
import gof.design.patterns.gof.mediator.callcenter.CallCenterMediator;

public abstract class Worker extends Person {

    public Worker(CallCenterMediator mediator, String name) {
        super(mediator, name);
        mediator.addWorker(this);
    }

    public abstract CallCenterCommand getSupportedCommand();

}
