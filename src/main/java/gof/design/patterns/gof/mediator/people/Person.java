package gof.design.patterns.gof.mediator.people;

import gof.design.patterns.gof.mediator.callcenter.CallCenterCommand;
import gof.design.patterns.gof.mediator.callcenter.CallCenterMediator;

public abstract class Person {

    private CallCenterMediator mediator;
    private String name;

    protected Person(CallCenterMediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public abstract void send(CallCenterCommand command, String msg);

    public abstract void receive(CallCenterCommand command, String msg);

    public String getName() {
        return name;
    }

    public CallCenterMediator getMediator() {
        return mediator;
    }

}
