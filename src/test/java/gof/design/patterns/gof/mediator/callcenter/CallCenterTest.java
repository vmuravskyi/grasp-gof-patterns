package gof.design.patterns.gof.mediator.callcenter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CallCenterTest {

    @Test
    void addDeliverer() {
        var callCenter = new CallCenter();
        var deliverer = callCenter.addDeliverer("Deliverer John");
        assertEquals("Deliverer John", deliverer.getName());
    }

    @Test
    void addRepairman() {
        var callCenter = new CallCenter();
        var repairman = callCenter.addRepairman("Repairman George");
        assertEquals("Repairman George", repairman.getName());
    }

    @Test
    void addTaxiDriver() {
        var callCenter = new CallCenter();
        var taxiDriver = callCenter.addTaxiDriver("Taxi-driver Bill");
        assertEquals("Taxi-driver Bill", taxiDriver.getName());
    }

}