package gof.design.patterns.gof.chainofresponsibility.emergencyservices;

public class FireDepartment extends EmergencyService {

    private static final String FIRE_DEPARTMENT_REQUEST_MESSAGE = "Fire";
    private static final String FIRE_DEPARTMENT_RESPONSE_MESSAGE = "Firefighters put out fires";

    @Override
    public String call(String request) {
        if (request.equalsIgnoreCase(FIRE_DEPARTMENT_REQUEST_MESSAGE)) {
            return FIRE_DEPARTMENT_RESPONSE_MESSAGE;
        } else {
            return this.callNext(request);
        }
    }

}
