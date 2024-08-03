package gof.design.patterns.gof.foxminded.decorator.application;

import gof.design.patterns.gof.foxminded.decorator.pizza.*;

public class Application {

    public static void main(String[] args) {

        CookablePizza largePizza = new BaconPizza(new MushroomPizza(new CheesePizza(new LargePizza())));
        System.out.println(largePizza.cook());

        SeafoodPizza seafoodPizza = new SeafoodPizza(new PineapplePizza(new SmallPizza()));
        System.out.println(seafoodPizza.cook());

    }

}
