package gof.design.patterns.gof.interpreter.kitchen;

import gof.design.patterns.gof.interpreter.pizza.Pizza;

public class AddBaconCommand extends CookPizzaCommand {

    @Override
    public Pizza cook(Pizza pizza) {
        pizza.setBaconQuantity(this.getQuantity());
        return pizza;
    }

}
