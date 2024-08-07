package gof.design.patterns.gof.visitor.pizzaelements;

import gof.design.patterns.gof.visitor.pizza.PizzaVisitor;

public class BaconIngredient extends PizzaIngredient {

    public BaconIngredient(int quantity) {
        super(quantity);
    }

    @Override
    public void accept(PizzaVisitor visitor) {
        visitor.visit(this);
    }

}
