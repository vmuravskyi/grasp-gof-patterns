package gof.design.patterns.gof.visitor.pizzaelements;

import gof.design.patterns.gof.visitor.pizza.PizzaVisitor;

import java.util.ArrayList;
import java.util.List;

public class PizzaBase extends PizzaIngredient {

    List<Ingredient> ingredients = new ArrayList<>();

    public PizzaBase(int quantity) {
        super(quantity);
    }

    public Ingredient addIngredient(Ingredient ingredient) {
        this.ingredients.add(ingredient);
        return ingredient;
    }

    @Override
    public void accept(PizzaVisitor pizzaVisitor) {
        pizzaVisitor.visit(this);
        for (var ingredient : this.ingredients) {
            ingredient.accept(pizzaVisitor);
        }
    }

}
