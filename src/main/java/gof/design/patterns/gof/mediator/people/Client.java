package gof.design.patterns.gof.mediator.people;

import gof.design.patterns.gof.mediator.callcenter.CallCenterCommand;
import gof.design.patterns.gof.mediator.callcenter.CallCenterMediator;

public class Client extends Person {

    private String address;

    public Client(CallCenterMediator mediator, String name, String address) {
        super(mediator, name);
        this.address = address;
    }

    @Override
    public void send(CallCenterCommand command, String msg) {
        var message = this.getName() + "\n" + this.getAddress() + "\n" + msg;
        getMediator().send(command, message);
    }

    @Override
    public void receive(CallCenterCommand command, String msg) {
        System.out.println(msg);
    }

    public String getAddress() {
        return address;
    }

}
