package gof.design.patterns.gof.foxminded.flyweight.army;

public class Tank implements Unit {

    private TankType unitType;

    public Tank(TankType unitType) {
        this.unitType = unitType;
    }

    @Override
    public void attack() {
        System.out.println("Tank shoots");
    }

}
