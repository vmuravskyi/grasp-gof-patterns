package gof.design.patterns.gof.prototype.cars;

import java.util.HashMap;
import java.util.Map;

public class VehiclePrototypeFactory {

    public static Map<VehicleType, VehiclePrototype> prototypes = new HashMap<VehicleType, VehiclePrototype>();

    static {
        prototypes.put(VehicleType.CAR, new Vehicle(VehicleType.CAR, "", ""));
        prototypes.put(VehicleType.MINIVAN, new Vehicle(VehicleType.MINIVAN, "", ""));
        prototypes.put(VehicleType.TRUCK, new Vehicle(VehicleType.TRUCK, "", ""));
    }

    public static VehiclePrototype createVehicle(final VehicleType type) throws CloneNotSupportedException {
        return ((VehiclePrototype) prototypes.get(type)).clone();
    }

}
