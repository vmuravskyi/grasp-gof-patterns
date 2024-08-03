package gof.design.patterns.gof.command.kitchen;

import gof.design.patterns.gof.command.pizza.Pizza;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ChefInvokerTest {

    @Test
    void shouldCookPizza() {
        var chief = new ChefInvoker();

        chief.addCookCommand(new CookPizzaBaseCommand(35));
        chief.addCookCommand(new AddCheeseCommand(50));
        chief.addCookCommand(new AddBaconCommand(40));
        Pizza smallCheeseBaconPizza = chief.cookPizza();
        assertEquals(35, smallCheeseBaconPizza.getPizzaSize());
        assertEquals(50D, smallCheeseBaconPizza.getCheeseQuantity());
        assertEquals(40D, smallCheeseBaconPizza.getBaconQuantity());
        assertEquals(0, smallCheeseBaconPizza.getPineappleQuantity());
        assertEquals(0, smallCheeseBaconPizza.getMushroomQuantity());
        assertEquals(0, smallCheeseBaconPizza.getSeafoodQuantity());

        chief.addCookCommand(new CookPizzaBaseCommand(50));
        chief.addCookCommand(new AddPineappleCommand(100));
        Pizza mediumPineapplePizza = chief.cookPizza();
        assertEquals(50, mediumPineapplePizza.getPizzaSize());
        assertEquals(0, mediumPineapplePizza.getCheeseQuantity());
        assertEquals(0, mediumPineapplePizza.getBaconQuantity());
        assertEquals(100D, mediumPineapplePizza.getPineappleQuantity());
        assertEquals(0, mediumPineapplePizza.getMushroomQuantity());
        assertEquals(0, mediumPineapplePizza.getSeafoodQuantity());

        chief.addCookCommand(new CookPizzaBaseCommand(60));
        chief.addCookCommand(new AddSeafoodCommand(100));
        chief.addCookCommand(new AddMushroomCommand(100));
        Pizza largeSeafoodPizza = chief.cookPizza();
        assertEquals(60, largeSeafoodPizza.getPizzaSize());
        assertEquals(0, largeSeafoodPizza.getCheeseQuantity());
        assertEquals(0, largeSeafoodPizza.getBaconQuantity());
        assertEquals(0, largeSeafoodPizza.getPineappleQuantity());
        assertEquals(100D, largeSeafoodPizza.getMushroomQuantity());
        assertEquals(100D, largeSeafoodPizza.getSeafoodQuantity());
    }

}