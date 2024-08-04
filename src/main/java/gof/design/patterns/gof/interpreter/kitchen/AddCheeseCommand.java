package gof.design.patterns.gof.interpreter.kitchen;

import gof.design.patterns.gof.interpreter.pizza.Pizza;

public class AddCheeseCommand extends CookPizzaCommand {

    @Override
    public Pizza cook(Pizza pizza) {
        pizza.setCheeseQuantity(this.getQuantity());
        return pizza;
    }

}
