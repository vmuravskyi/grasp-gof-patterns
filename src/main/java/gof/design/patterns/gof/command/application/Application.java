package gof.design.patterns.gof.command.application;

import gof.design.patterns.gof.command.kitchen.*;
import gof.design.patterns.gof.command.pizza.Pizza;

public class Application {

    public static void main(String[] args) {
        var chief = new ChefInvoker();

        chief.addCookCommand(new CookPizzaBaseCommand(35))
                .addCookCommand(new AddCheeseCommand(45))
                .addCookCommand(new AddBaconCommand(50))
                .addCookCommand(new AddMushroomCommand(25));

        Pizza smallPizza = chief.cookPizza();
        System.out.println(smallPizza);

        chief.addCookCommand(new CookPizzaBaseCommand(50));
        chief.addCookCommand(new AddPineappleCommand(100));
        Pizza mediumPineapplePizza = chief.cookPizza();
        System.out.println(mediumPineapplePizza);

        chief.addCookCommand(new CookPizzaBaseCommand(60));
        chief.addCookCommand(new AddSeafoodCommand(100));
        Pizza largeSeafoodPizza = chief.cookPizza();
        System.out.println(largeSeafoodPizza);
    }

}
