package gof.design.patterns.gof.visitor.kitchen;

import gof.design.patterns.gof.visitor.pizza.Pizza;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ChefTest {

    @Test
    void shouldCookPizza() {
        var chief = new Chef();

        Pizza smallCheeseBaconPizza = chief
                .addPizzaBase(35)
                .addCheese(50)
                .addBacon(40).cook();
        assertEquals(35, smallCheeseBaconPizza.getPizzaSize());
        assertEquals(50D, smallCheeseBaconPizza.getCheeseQuantity());
        assertEquals(40D, smallCheeseBaconPizza.getBaconQuantity());
        assertEquals(0, smallCheeseBaconPizza.getPineappleQuantity());
        assertEquals(0, smallCheeseBaconPizza.getMushroomQuantity());
        assertEquals(0, smallCheeseBaconPizza.getSeafoodQuantity());


        Pizza mediumPineapplePizza = chief
                .addPizzaBase(50)
                .addPineapple(100).cook();
        assertEquals(50, mediumPineapplePizza.getPizzaSize());
        assertEquals(0, mediumPineapplePizza.getCheeseQuantity());
        assertEquals(0, mediumPineapplePizza.getBaconQuantity());
        assertEquals(100D, mediumPineapplePizza.getPineappleQuantity());
        assertEquals(0, mediumPineapplePizza.getMushroomQuantity());
        assertEquals(0, mediumPineapplePizza.getSeafoodQuantity());


        Pizza largeSeafoodPizza = chief
                .addPizzaBase(60)
                .addSeafood(100)
                .addMushroom(100)
                .cook();
        assertEquals(60, largeSeafoodPizza.getPizzaSize());
        assertEquals(0, largeSeafoodPizza.getCheeseQuantity());
        assertEquals(0, largeSeafoodPizza.getBaconQuantity());
        assertEquals(0, largeSeafoodPizza.getPineappleQuantity());
        assertEquals(100D, largeSeafoodPizza.getMushroomQuantity());
        assertEquals(100D, largeSeafoodPizza.getSeafoodQuantity());
    }

}