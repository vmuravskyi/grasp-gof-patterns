package gof.design.patterns.gof.foxminded.flyweight.army;

public class TankType extends UnitType {

    public String model = "";

    public TankType(byte[] texture, byte[] sound, String model) {
        super(texture, sound);
        this.model = model;
    }

}
