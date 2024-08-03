package gof.design.patterns.gof.foxminded.decorator;

import gof.design.patterns.gof.foxminded.decorator.pizza.CheesePizza;
import gof.design.patterns.gof.foxminded.decorator.pizza.LargePizza;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CheesePizzaTest {

    @Test
    void cook() {
        var pizza = new CheesePizza(new LargePizza());
        assertEquals("cheese large pizza", pizza.cook());
    }

}
