package gof.design.patterns.gof.builder.pizza;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PizzaTest {

    @Test
    void shouldCreatePizza() {
        int smallSize = 35;
        double smallCheese = 15D;
        double smallBacon = 15D;
        Pizza smallPizza = Pizza.builder()
                .setPizzaSize(smallSize)
                .setCheeseQuantity(smallCheese)
                .setBaconQuantity(smallBacon)
                .build();
        assertEquals(smallSize, smallPizza.getPizzaSize());
        assertEquals(smallCheese, smallPizza.getCheeseQuantity());
        assertEquals(smallBacon, smallPizza.getBaconQuantity());
        assertEquals(0, smallPizza.getPineappleQuantity());
        assertEquals(0, smallPizza.getSeafoodQuantity());
        assertEquals(0, smallPizza.getMushroomQuantity());
    }

}