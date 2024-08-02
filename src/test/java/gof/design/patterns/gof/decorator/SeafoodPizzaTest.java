package gof.design.patterns.gof.decorator;

import gof.design.patterns.gof.decorator.pizza.LargePizza;
import gof.design.patterns.gof.decorator.pizza.SeafoodPizza;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SeafoodPizzaTest {

    @Test
    void cook() {
        var pizza = new SeafoodPizza(new LargePizza());
        assertEquals("seafood large pizza", pizza.cook());
    }

}
