package gof.design.patterns.gof.command.kitchen;

import gof.design.patterns.gof.command.pizza.Pizza;

public class AddBaconCommand extends CookPizzaCommand {

    public AddBaconCommand(int quantity) {
        super(quantity);
    }

    @Override
    public void cook(Pizza pizza) {
        pizza.setBaconQuantity(this.getQuantity());
    }

}
