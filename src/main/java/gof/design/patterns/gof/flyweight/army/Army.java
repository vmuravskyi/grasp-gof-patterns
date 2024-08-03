package gof.design.patterns.gof.flyweight.army;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Army {

    private List<Unit> units;
    private int xCoordinate = 0;
    private int yCoordinate = 0;

    public Army() {
        this.units = new ArrayList<>();
    }

    public Army addSoldiers(int number, byte[] texture, byte[] sound, String rank) {
        var soldierType = new SoldierType(texture, sound, rank);
        IntStream.range(0, number).forEach((i) ->
                this.units.add(new Soldier(soldierType))
        );
        return this;
    }

    public Army addTanks(int number, byte[] texture, byte[] sound, String rank) {
        var tankType = new TankType(texture, sound, rank);
        IntStream.range(0, number).forEach((i) ->
                this.units.add(new Tank(tankType)));
        return this;
    }

    public void move(int x, int y) {
        this.xCoordinate = x;
        this.yCoordinate = y;
    }

    public void attack() {
        this.units.forEach(Unit::attack);
    }

    public List<Unit> getUnits() {
        return units;
    }

    public int getxCoordinate() {
        return xCoordinate;
    }

    public int getyCoordinate() {
        return yCoordinate;
    }

}
