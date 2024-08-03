package gof.design.patterns.gof.foxminded.flyweight.army;

public class Soldier implements Unit {

    private SoldierType unitType;

    public Soldier(SoldierType unitType) {
        this.unitType = unitType;
    }

    @Override
    public void attack() {
        System.out.println("Soldier attacks by a sword");
    }

}
