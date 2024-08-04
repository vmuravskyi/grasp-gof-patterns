package gof.design.patterns.gof.interpreter.kitchen;

import gof.design.patterns.gof.interpreter.pizza.Pizza;

public class AddPineappleCommand extends CookPizzaCommand {

    @Override
    public Pizza cook(Pizza pizza) {
        pizza.setPineappleQuantity(this.getQuantity());
        return pizza;
    }

}
