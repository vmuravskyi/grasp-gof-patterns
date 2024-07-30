package gof.design.patterns.gof.prototype.cars;

public interface VehiclePrototype extends Cloneable {

    VehiclePrototype clone() throws CloneNotSupportedException;

    VehicleType getType();

    String getColor();

    void setColor(String color);

    String getNumber();

    void setNumber(String number);

}
