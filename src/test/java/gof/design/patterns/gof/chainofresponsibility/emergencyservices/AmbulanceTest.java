package gof.design.patterns.gof.chainofresponsibility.emergencyservices;


import gof.design.patterns.gof.chainofresponsibility.emergencyservices.Ambulance;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AmbulanceTest {

    @Test
    void shouldCallAmbulance() {
        var ambulance = new Ambulance();
        assertEquals("Ambulance car is on its way", ambulance.call("first aim"));
    }

}