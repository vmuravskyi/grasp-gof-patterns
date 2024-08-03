package gof.design.patterns.gof.foxminded.chainofresponsibility.emergencyservices;

public class Ambulance extends EmergencyService {

    private static final String AMBULANCE_REQUEST_MESSAGE = "First aim";
    private static final String AMBULANCE_RESPONSE_MESSAGE = "Ambulance car is on its way";

    @Override
    public String call(String request) {
        if (request.equalsIgnoreCase(Ambulance.AMBULANCE_REQUEST_MESSAGE)) {
            return AMBULANCE_RESPONSE_MESSAGE;
        } else {
            return this.callNext(request);
        }
    }

}
