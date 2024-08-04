package gof.design.patterns.gof.chainofresponsibility.application;

import gof.design.patterns.gof.chainofresponsibility.emergencyservices.Ambulance;
import gof.design.patterns.gof.chainofresponsibility.emergencyservices.EmergencyService;
import gof.design.patterns.gof.chainofresponsibility.emergencyservices.FireDepartment;
import gof.design.patterns.gof.chainofresponsibility.emergencyservices.Police;

public class Application {

    public static void main(String[] args) {

        EmergencyService emergencyService = new Police();
        emergencyService.setNext(new FireDepartment()).setNext(new Ambulance());

        System.out.println(emergencyService.call("fire"));
        System.out.println(emergencyService.call("police"));
        System.out.println(emergencyService.call("first aim"));
        System.out.println(emergencyService.call("grocery"));
    }

}