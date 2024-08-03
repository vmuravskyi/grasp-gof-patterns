package gof.design.patterns.gof.command.kitchen;

import gof.design.patterns.gof.command.pizza.Pizza;

public class AddMushroomCommand extends CookPizzaCommand {

    public AddMushroomCommand(int quantity) {
        super(quantity);
    }

    @Override
    public void cook(Pizza pizza) {
        pizza.setMushroomQuantity(this.getQuantity());
    }

}
