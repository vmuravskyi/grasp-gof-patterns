package gof.design.patterns.gof.prototype.cars;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class VehiclePrototypeFactoryTest {

    private static final String CAR_NUMBER = "333 NT 98";
    private static final String CAR_COLOR = "Red";
    private static final String MINIVAN_NUMBER = "435 XX 09";
    private static final String MINIVAN_COLOR = "Yellow";
    private static final String TRUCK_NUMBER = "098 NT 01";
    private static final String TRUCK_COLOR = "Blue";

    @Test
    public void shouldGenerateVehicles() throws CloneNotSupportedException {

        var car = VehiclePrototypeFactory.createVehicle(VehicleType.CAR);
        assertTrue(car instanceof Vehicle && ((Vehicle) car).getType() == VehicleType.CAR);
        car.setNumber(CAR_NUMBER);
        car.setColor(CAR_COLOR);
        assertEquals(CAR_NUMBER, car.getNumber());
        assertEquals(CAR_COLOR, car.getColor());

        var minivan = VehiclePrototypeFactory.createVehicle(VehicleType.MINIVAN);
        assertTrue(minivan instanceof Vehicle && ((Vehicle) minivan).getType() == VehicleType.MINIVAN);
        minivan.setNumber(MINIVAN_NUMBER);
        minivan.setColor(MINIVAN_COLOR);
        assertEquals(MINIVAN_NUMBER, minivan.getNumber());
        assertEquals(MINIVAN_COLOR, minivan.getColor());

        var truck = VehiclePrototypeFactory.createVehicle(VehicleType.TRUCK);
        assertTrue(truck instanceof Vehicle && ((Vehicle) truck).getType() == VehicleType.TRUCK);
        truck.setNumber(TRUCK_NUMBER);
        truck.setColor(TRUCK_COLOR);
        assertEquals(TRUCK_NUMBER, truck.getNumber());
        assertEquals(TRUCK_COLOR, truck.getColor());
    }

}