package gof.design.patterns.gof.flyweight.army;

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
