package gof.design.patterns.gof.foxminded.prototype.cars;

import gof.design.patterns.gof.foxminded.prototype.cars.Vehicle;
import gof.design.patterns.gof.foxminded.prototype.cars.VehicleType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class VehicleTest {

    @Test
    void shouldCreateVehicle() {
        var car = new Vehicle(VehicleType.CAR, "red", "123 VN 09");
        var minivan = new Vehicle(VehicleType.MINIVAN, "red", "123 VN 09");
        var truck = new Vehicle(VehicleType.TRUCK, "red", "123 VN 09");

        assertEquals("Vehicle{type=CAR, color='red', number='123 VN 09'}", car.toString());
        assertEquals("Vehicle{type=MINIVAN, color='red', number='123 VN 09'}", minivan.toString());
        assertEquals("Vehicle{type=TRUCK, color='red', number='123 VN 09'}", truck.toString());
    }

}
