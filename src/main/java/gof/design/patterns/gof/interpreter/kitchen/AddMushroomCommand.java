package gof.design.patterns.gof.interpreter.kitchen;

import gof.design.patterns.gof.interpreter.pizza.Pizza;

public class AddMushroomCommand extends CookPizzaCommand {

    @Override
    public Pizza cook(Pizza pizza) {
        pizza.setMushroomQuantity(this.getQuantity());
        return pizza;
    }

}
