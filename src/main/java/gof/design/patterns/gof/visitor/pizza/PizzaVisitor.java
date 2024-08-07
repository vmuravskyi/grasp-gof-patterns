package gof.design.patterns.gof.visitor.pizza;

import gof.design.patterns.gof.visitor.pizzaelements.*;

public interface PizzaVisitor {

    void visit(BaconIngredient ingredient);

    void visit(CheeseIngredient ingredient);

    void visit(MushroomIngredient ingredient);

    void visit(PineappleIngredient ingredient);

    void visit(SeafoodIngredient ingredient);

    void visit(PizzaBase ingredient);

}
