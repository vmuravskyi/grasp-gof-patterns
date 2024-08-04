package gof.design.patterns.gof.interpreter.kitchen;

import gof.design.patterns.gof.interpreter.pizza.Pizza;

public class AddSeafoodCommand extends CookPizzaCommand {

    @Override
    public Pizza cook(Pizza pizza) {
        pizza.setSeafoodQuantity(this.getQuantity());
        return pizza;
    }

}
