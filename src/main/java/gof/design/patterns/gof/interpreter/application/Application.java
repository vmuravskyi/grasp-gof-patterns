package gof.design.patterns.gof.interpreter.application;

import gof.design.patterns.gof.interpreter.kitchen.ChefInvoker;
import gof.design.patterns.gof.interpreter.kitchen.InterpreterCookingPizzaException;
import gof.design.patterns.gof.interpreter.pizza.Pizza;

public class Application {

    public static void main(String[] args) throws InterpreterCookingPizzaException {
        var chief = new ChefInvoker();
        var smallCheeseBaconPizza = chief.cookPizza("Cook pizza 35 with cheese 50 and bacon 40");
        System.out.println(smallCheeseBaconPizza);

        var mediumPineapplePizza = chief.cookPizza("Make the most delicious pizza you can size 50 sm. " +
                                                   "I also need additional pineapple 100");
        System.out.println(mediumPineapplePizza);

        var largeSeafoodPizza = chief.cookPizza("Please, cook  me a pizza 60 size and I need seafood 100 gram");
        System.out.println(largeSeafoodPizza);

        Pizza pizza = chief.cookPizza("make pizza size 50 with bacon 50 cheese 60 mushroom 70");
        System.out.println(pizza);
    }

}
