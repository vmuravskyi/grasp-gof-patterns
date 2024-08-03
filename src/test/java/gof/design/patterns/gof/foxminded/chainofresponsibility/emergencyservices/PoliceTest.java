package gof.design.patterns.gof.foxminded.chainofresponsibility.emergencyservices;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PoliceTest {

    @Test
    void shouldCallPolice() {
        var police = new Police();
        assertEquals("Policemen are coming", police.call("police"));
    }

}
