package gof.design.patterns.gof.chainofresponsibility.emergencyservices;

public class Police extends EmergencyService {

    private static final String POLICE_REQUEST_MESSAGE = "Police";
    private static final String POLICE_RESPONSE_MESSAGE = "Policemen are coming";

    @Override
    public String call(String request) {
        if (request.equalsIgnoreCase(Police.POLICE_REQUEST_MESSAGE)) {
            return POLICE_RESPONSE_MESSAGE;
        } else {
            return this.callNext(request);
        }
    }

}
