package gof.design.patterns.gof.command.pizza;

public class Pizza {

    private int pizzaSize;
    private double cheeseQuantity;
    private double baconQuantity;
    private double pineappleQuantity;
    private double mushroomQuantity;
    private double seafoodQuantity;

    public Pizza() {
        this.pizzaSize = 0;
        this.cheeseQuantity = 0;
        this.baconQuantity = 0;
        this.pineappleQuantity = 0;
        this.mushroomQuantity = 0;
        this.seafoodQuantity = 0;
    }

    public int getPizzaSize() {
        return pizzaSize;
    }

    public void setPizzaSize(int pizzaSize) {
        this.pizzaSize = pizzaSize;
    }

    public double getCheeseQuantity() {
        return cheeseQuantity;
    }

    public void setCheeseQuantity(double cheeseQuantity) {
        this.cheeseQuantity = cheeseQuantity;
    }

    public double getBaconQuantity() {
        return baconQuantity;
    }

    public void setBaconQuantity(double baconQuantity) {
        this.baconQuantity = baconQuantity;
    }

    public double getPineappleQuantity() {
        return pineappleQuantity;
    }

    public void setPineappleQuantity(double pineappleQuantity) {
        this.pineappleQuantity = pineappleQuantity;
    }

    public double getMushroomQuantity() {
        return mushroomQuantity;
    }

    public void setMushroomQuantity(double mushroomQuantity) {
        this.mushroomQuantity = mushroomQuantity;
    }

    public double getSeafoodQuantity() {
        return seafoodQuantity;
    }

    public void setSeafoodQuantity(double seafoodQuantity) {
        this.seafoodQuantity = seafoodQuantity;
    }

    @Override
    public String toString() {
        return "Pizza{" +
               "pizzaSize=" + pizzaSize +
               ", cheeseQuantity=" + cheeseQuantity +
               ", baconQuantity=" + baconQuantity +
               ", pineappleQuantity=" + pineappleQuantity +
               ", mushroomQuantity=" + mushroomQuantity +
               ", seafoodQuantity=" + seafoodQuantity +
               '}';
    }

}
