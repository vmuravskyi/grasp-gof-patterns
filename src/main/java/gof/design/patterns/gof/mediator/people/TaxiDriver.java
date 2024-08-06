package gof.design.patterns.gof.mediator.people;

import gof.design.patterns.gof.mediator.callcenter.CallCenterCommand;
import gof.design.patterns.gof.mediator.callcenter.CallCenterMediator;

public class TaxiDriver extends Worker {

    public TaxiDriver(CallCenterMediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public CallCenterCommand getSupportedCommand() {
        return CallCenterCommand.CALL_TAXI;
    }

    @Override
    public void send(CallCenterCommand command, String msg) {

    }

    @Override
    public void receive(CallCenterCommand command, String msg) {
        System.out.println(this.getName() + ": I'm driving to the call " + msg);
    }

}
