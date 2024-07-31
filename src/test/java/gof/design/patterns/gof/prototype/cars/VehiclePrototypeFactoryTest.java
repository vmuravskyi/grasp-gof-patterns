package gof.design.patterns.gof.prototype.cars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehiclePrototypeFactoryTest {

    private static final String CAR_NUMBER = "333 NT 98";
    private static final String CAR_COLOR = "Red";
    private static final String MINIVAN_NUMBER = "435 XX 09";
    private static final String MINIVAN_COLOR = "Yellow";
    private static final String TRUCK_NUMBER = "098 NT 01";
    private static final String TRUCK_COLOR = "Blue";

    @Test
    void shouldGenerateVehicles() throws CloneNotSupportedException {

        var car = VehiclePrototypeFactory.createVehicle(VehicleType.CAR);
        car.setNumber(CAR_NUMBER);
        car.setColor(CAR_COLOR);
        assertInstanceOf(Vehicle.class, car);
        assertSame(VehicleType.CAR, car.getType());
        assertEquals(CAR_NUMBER, car.getNumber());
        assertEquals(CAR_COLOR, car.getColor());

        var minivan = VehiclePrototypeFactory.createVehicle(VehicleType.MINIVAN);
        minivan.setNumber(MINIVAN_NUMBER);
        minivan.setColor(MINIVAN_COLOR);
        assertInstanceOf(Vehicle.class, minivan);
        assertSame(VehicleType.MINIVAN, minivan.getType());
        assertEquals(MINIVAN_NUMBER, minivan.getNumber());
        assertEquals(MINIVAN_COLOR, minivan.getColor());

        var truck = VehiclePrototypeFactory.createVehicle(VehicleType.TRUCK);
        truck.setNumber(TRUCK_NUMBER);
        truck.setColor(TRUCK_COLOR);
        assertInstanceOf(Vehicle.class, truck);
        assertSame(VehicleType.TRUCK, truck.getType());
        assertEquals(TRUCK_NUMBER, truck.getNumber());
        assertEquals(TRUCK_COLOR, truck.getColor());
    }

}