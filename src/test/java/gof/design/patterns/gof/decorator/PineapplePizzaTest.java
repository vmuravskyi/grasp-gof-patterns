package gof.design.patterns.gof.decorator;

import gof.design.patterns.gof.decorator.pizza.LargePizza;
import gof.design.patterns.gof.decorator.pizza.PineapplePizza;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PineapplePizzaTest {

    @Test
    void cook() {
        var pizza = new PineapplePizza(new LargePizza());
        assertEquals("pineapple large pizza", pizza.cook());
    }

}