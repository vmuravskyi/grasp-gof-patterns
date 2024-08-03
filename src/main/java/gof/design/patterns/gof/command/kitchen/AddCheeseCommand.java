package gof.design.patterns.gof.command.kitchen;

import gof.design.patterns.gof.command.pizza.Pizza;

public class AddCheeseCommand extends CookPizzaCommand {

    public AddCheeseCommand(int quantity) {
        super(quantity);
    }

    @Override
    public void cook(Pizza pizza) {
        pizza.setCheeseQuantity(this.getQuantity());
    }

}
