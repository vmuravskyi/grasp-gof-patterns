package gof.design.patterns.gof.interpreter.kitchen;

import gof.design.patterns.gof.interpreter.pizza.Pizza;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChefInvokerTest {

    @Test
    void shouldCookPizza() {

        var chief = new ChefInvoker();

        assertDoesNotThrow(() -> {
            Pizza smallCheeseBaconPizza = chief.cookPizza("Cook pizza 35 with cheese 50 and bacon 40");
            assertEquals(35, smallCheeseBaconPizza.getPizzaSize());
            assertEquals(50D, smallCheeseBaconPizza.getCheeseQuantity());
            assertEquals(40D, smallCheeseBaconPizza.getBaconQuantity());
            assertEquals(0, smallCheeseBaconPizza.getPineappleQuantity());
            assertEquals(0, smallCheeseBaconPizza.getMushroomQuantity());
            assertEquals(0, smallCheeseBaconPizza.getSeafoodQuantity());
        });
        assertDoesNotThrow(() -> {
            Pizza mediumPineapplePizza = chief.cookPizza("Cook pizza 50 and put pineapple 100");
            assertEquals(50, mediumPineapplePizza.getPizzaSize());
            assertEquals(0, mediumPineapplePizza.getCheeseQuantity());
            assertEquals(0, mediumPineapplePizza.getBaconQuantity());
            assertEquals(100D, mediumPineapplePizza.getPineappleQuantity());
            assertEquals(0, mediumPineapplePizza.getMushroomQuantity());
            assertEquals(0, mediumPineapplePizza.getSeafoodQuantity());
        });
        assertDoesNotThrow(() -> {
            Pizza largeSeafoodPizza = chief.cookPizza("Please, cook  me a pizza 60 size and I need seafood 100 and fresh mushroom 100");
            assertEquals(60, largeSeafoodPizza.getPizzaSize());
            assertEquals(0, largeSeafoodPizza.getCheeseQuantity());
            assertEquals(0, largeSeafoodPizza.getBaconQuantity());
            assertEquals(0, largeSeafoodPizza.getPineappleQuantity());
            assertEquals(100D, largeSeafoodPizza.getMushroomQuantity());
            assertEquals(100D, largeSeafoodPizza.getSeafoodQuantity());
        });
    }

    @Test
    void shouldThrowInterpreterCookingPizzaException() {
        var chief = new ChefInvoker();
        assertThrows(InterpreterCookingPizzaException.class, () -> {
            chief.cookPizza("Do pizza 50 and put pineapple 100! Now!");
        });

        assertThrows(InterpreterCookingPizzaException.class, () -> {
            chief.cookPizza("I don't like pizza at all");
        });
    }

}