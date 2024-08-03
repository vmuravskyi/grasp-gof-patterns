package gof.design.patterns.gof.foxminded.prototype.application;

import gof.design.patterns.gof.foxminded.prototype.cars.VehiclePrototypeFactory;
import gof.design.patterns.gof.foxminded.prototype.cars.VehicleType;

public class Application {

    public static void main(String[] args) {

        try {
            var car = VehiclePrototypeFactory.createVehicle(VehicleType.CAR);
            System.out.println(car);

            var minivan = VehiclePrototypeFactory.createVehicle(VehicleType.MINIVAN);
            System.out.println(minivan);

            var truck = VehiclePrototypeFactory.createVehicle(VehicleType.TRUCK);
            System.out.println(truck);

        } catch (CloneNotSupportedException e) {
            System.out.println(e.getMessage());
        }

    }

}
