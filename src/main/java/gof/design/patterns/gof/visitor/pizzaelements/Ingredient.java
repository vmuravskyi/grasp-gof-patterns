package gof.design.patterns.gof.visitor.pizzaelements;

import gof.design.patterns.gof.visitor.pizza.PizzaVisitor;

public interface Ingredient {

    void accept(PizzaVisitor visitor);

    void setQuantity(int quantity);

}
