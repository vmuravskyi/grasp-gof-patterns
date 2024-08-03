package gof.design.patterns.gof.foxminded.builder.pizza;

public class Pizza {

    private int pizzaSize;
    private double cheeseQuantity;
    private double baconQuantity;
    private double pineappleQuantity;
    private double mushroomQuantity;
    private double seafoodQuantity;

    private Pizza(int pizzaSize,
                  double cheeseQuantity,
                  double baconQuantity,
                  double pineappleQuantity,
                  double mushroomQuantity,
                  double seafoodQuantity) {
        this.pizzaSize = pizzaSize;
        this.cheeseQuantity = cheeseQuantity;
        this.baconQuantity = baconQuantity;
        this.pineappleQuantity = pineappleQuantity;
        this.mushroomQuantity = mushroomQuantity;
        this.seafoodQuantity = seafoodQuantity;
    }

    public static PizzaBuilder builder() {
        return new PizzaBuilder();
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

    public static class PizzaBuilder {

        private int pizzaSize;
        private double cheeseQuantity;
        private double baconQuantity;
        private double pineappleQuantity;
        private double mushroomQuantity;
        private double seafoodQuantity;


        public PizzaBuilder setPizzaSize(int pizzaSize) {
            this.pizzaSize = pizzaSize;
            return this;
        }

        public PizzaBuilder setCheeseQuantity(double cheeseQuantity) {
            this.cheeseQuantity = cheeseQuantity;
            return this;
        }

        public PizzaBuilder setBaconQuantity(double baconQuantity) {
            this.baconQuantity = baconQuantity;
            return this;
        }

        public PizzaBuilder setPineappleQuantity(double pineappleQuantity) {
            this.pineappleQuantity = pineappleQuantity;
            return this;
        }

        public PizzaBuilder setMushroomQuantity(double mushroomQuantity) {
            this.mushroomQuantity = mushroomQuantity;
            return this;
        }

        public PizzaBuilder setSeafoodQuantity(double seafoodQuantity) {
            this.seafoodQuantity = seafoodQuantity;
            return this;
        }

        public Pizza build() {
            return new Pizza(this.pizzaSize,
                    this.cheeseQuantity,
                    this.baconQuantity,
                    this.pineappleQuantity,
                    this.mushroomQuantity,
                    this.seafoodQuantity
            );
        }

    }
}
