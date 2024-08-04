package gof.design.patterns.gof.interpreter.kitchen;

import gof.design.patterns.gof.interpreter.pizza.Pizza;

public interface CookCommand {

    Pizza cook(Pizza pizza);

    void setQuantity(int parseInt);

}
