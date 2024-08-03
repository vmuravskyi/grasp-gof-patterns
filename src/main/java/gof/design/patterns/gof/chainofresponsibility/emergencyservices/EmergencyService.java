package gof.design.patterns.gof.chainofresponsibility.emergencyservices;

public abstract class EmergencyService {

    private static final String WRONG_RESPONSE_MESSAGE = "Please specify request";

    private EmergencyService next;

    public EmergencyService setNext(EmergencyService next){
        this.next = next;
        return next;
    }

    public abstract String call(String request);

    public String callNext(String request){
        if (this.next == null) {
            return WRONG_RESPONSE_MESSAGE;
        } else {
            return this.next.call(request);
        }
    }

}
