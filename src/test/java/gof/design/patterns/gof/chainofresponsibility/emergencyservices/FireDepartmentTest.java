package gof.design.patterns.gof.chainofresponsibility.emergencyservices;

import gof.design.patterns.gof.chainofresponsibility.emergencyservices.FireDepartment;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FireDepartmentTest {

    @Test
    void shouldCallFireDepartment() {
        var fireDepartment = new FireDepartment();
        assertEquals("Firefighters put out fires", fireDepartment.call("fire"));
    }

}
