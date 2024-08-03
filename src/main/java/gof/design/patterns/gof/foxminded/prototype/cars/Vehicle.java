package gof.design.patterns.gof.foxminded.prototype.cars;

public class Vehicle implements VehiclePrototype {

    private VehicleType type;
    private String color;
    private String number;

    protected Vehicle(VehicleType type, String color, String number) {
        this.type = type;
        this.color = color;
        this.number = number;
    }

    @Override
    public VehicleType getType() {
        return type;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String getNumber() {
        return number;
    }

    @Override
    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public VehiclePrototype clone() throws CloneNotSupportedException {
        return (VehiclePrototype) super.clone();
    }

    @Override
    public String toString() {
        return "Vehicle{" +
               "type=" + type +
               ", color='" + color + '\'' +
               ", number='" + number + '\'' +
               '}';
    }

}
