package gof.design.patterns.gof.decorator;

import gof.design.patterns.gof.decorator.pizza.CheesePizza;
import gof.design.patterns.gof.decorator.pizza.LargePizza;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CheesePizzaTest {

    @Test
    void cook() {
        var pizza = new CheesePizza(new LargePizza());
        assertEquals("cheese large pizza", pizza.cook());
    }

}
