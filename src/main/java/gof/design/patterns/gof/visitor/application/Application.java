package gof.design.patterns.gof.visitor.application;

import gof.design.patterns.gof.visitor.kitchen.Chef;

public class Application {

    public static void main(String[] args) {
        var chief = new Chef();

        chief.addPizzaBase(35)
                .addCheese(50)
                .addBacon(40);
        var smallCheeseBaconPizza = chief.cook();
        System.out.println(smallCheeseBaconPizza);

        chief.addPizzaBase(50)
                .addPineapple(100);
        var mediumPineapplePizza = chief.cook();
        System.out.println(mediumPineapplePizza);

        chief.addPizzaBase(60)
                .addSeafood(100);
        var largeSeafoodPizza = chief.cook();
        System.out.println(largeSeafoodPizza);
    }

}
