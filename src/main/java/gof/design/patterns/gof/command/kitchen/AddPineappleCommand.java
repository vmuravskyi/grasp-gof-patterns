package gof.design.patterns.gof.command.kitchen;

import gof.design.patterns.gof.command.pizza.Pizza;

public class AddPineappleCommand extends CookPizzaCommand {

    public AddPineappleCommand(int quantity) {
        super(quantity);
    }

    @Override
    public void cook(Pizza pizza) {
        pizza.setPineappleQuantity(this.getQuantity());
    }

}
