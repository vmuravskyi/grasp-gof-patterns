package gof.design.patterns.gof.visitor.kitchen;

import gof.design.patterns.gof.visitor.pizza.Pizza;
import gof.design.patterns.gof.visitor.pizzaelements.*;

public class Chef {

    private PizzaBase pizzaBase;

    public Chef addPizzaBase(int size) {
        this.pizzaBase = new PizzaBase(size);
        return this;
    }

    public Chef addBacon(int quantity) {
        this.pizzaBase.addIngredient(new BaconIngredient(quantity));
        return this;
    }

    public Chef addCheese(int quantity) {
        this.pizzaBase.addIngredient(new CheeseIngredient(quantity));
        return this;
    }

    public Chef addMushroom(int quantity) {
        this.pizzaBase.addIngredient(new MushroomIngredient(quantity));
        return this;
    }

    public Chef addPineapple(int quantity) {
        this.pizzaBase.addIngredient(new PineappleIngredient(quantity));
        return this;
    }

    public Chef addSeafood(int quantity) {
        this.pizzaBase.addIngredient(new SeafoodIngredient(quantity));
        return this;
    }

    public Pizza cook() {
        var pizza = new Pizza();
        pizzaBase.accept(pizza);
        return pizza;
    }

}
