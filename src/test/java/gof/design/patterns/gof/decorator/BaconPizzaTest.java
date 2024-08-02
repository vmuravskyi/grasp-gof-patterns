package gof.design.patterns.gof.decorator;

import gof.design.patterns.gof.decorator.pizza.BaconPizza;
import gof.design.patterns.gof.decorator.pizza.LargePizza;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BaconPizzaTest {

    @Test
    void cook() {
        var pizza = new BaconPizza(new LargePizza());
        assertEquals("bacon large pizza", pizza.cook());
    }

}
