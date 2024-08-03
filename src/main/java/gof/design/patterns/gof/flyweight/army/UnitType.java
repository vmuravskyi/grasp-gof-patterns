package gof.design.patterns.gof.flyweight.army;

public abstract class UnitType {

    private byte[] texture;
    private byte[] sound;

    protected UnitType(byte[] texture, byte[] sound) {
        this.texture = texture;
        this.sound = sound;
    }

}
