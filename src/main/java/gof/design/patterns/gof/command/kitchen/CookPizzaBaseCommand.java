package gof.design.patterns.gof.command.kitchen;

import gof.design.patterns.gof.command.pizza.Pizza;

public class CookPizzaBaseCommand extends CookPizzaCommand {

    public CookPizzaBaseCommand(int quantity) {
        super(quantity);
    }

    @Override
    public void cook(Pizza pizza) {
        pizza.setPizzaSize(this.getQuantity());
    }

}
