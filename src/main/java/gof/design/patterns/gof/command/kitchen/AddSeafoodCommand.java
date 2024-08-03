package gof.design.patterns.gof.command.kitchen;

import gof.design.patterns.gof.command.pizza.Pizza;

public class AddSeafoodCommand extends CookPizzaCommand {

    public AddSeafoodCommand(int quantity) {
        super(quantity);
    }

    @Override
    public void cook(Pizza pizza) {
        pizza.setSeafoodQuantity(this.getQuantity());
    }

}
