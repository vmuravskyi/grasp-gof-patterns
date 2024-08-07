package gof.design.patterns.gof.visitor.pizza;

import gof.design.patterns.gof.visitor.pizzaelements.*;

import java.util.StringJoiner;

public class Pizza implements PizzaVisitor {

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

    public double getCheeseQuantity() {
        return cheeseQuantity;
    }

    public double getBaconQuantity() {
        return baconQuantity;
    }

    public double getPineappleQuantity() {
        return pineappleQuantity;
    }

    public double getMushroomQuantity() {
        return mushroomQuantity;
    }

    public double getSeafoodQuantity() {
        return seafoodQuantity;
    }

    @Override
    public void visit(BaconIngredient ingredient) {
        this.baconQuantity = ingredient.getQuantity();
    }

    @Override
    public void visit(CheeseIngredient ingredient) {
        this.cheeseQuantity = ingredient.getQuantity();
    }

    @Override
    public void visit(MushroomIngredient ingredient) {
        this.mushroomQuantity = ingredient.getQuantity();
    }

    @Override
    public void visit(PineappleIngredient ingredient) {
        this.pineappleQuantity = ingredient.getQuantity();
    }

    @Override
    public void visit(SeafoodIngredient ingredient) {
        this.seafoodQuantity = ingredient.getQuantity();
    }

    @Override
    public void visit(PizzaBase ingredient) {
        this.pizzaSize = ingredient.getQuantity();
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Pizza.class.getSimpleName() + "[", "]")
                .add("pizzaSize=" + pizzaSize)
                .add("cheeseQuantity=" + cheeseQuantity)
                .add("baconQuantity=" + baconQuantity)
                .add("pineappleQuantity=" + pineappleQuantity)
                .add("mushroomQuantity=" + mushroomQuantity)
                .add("seafoodQuantity=" + seafoodQuantity)
                .toString();
    }

}
