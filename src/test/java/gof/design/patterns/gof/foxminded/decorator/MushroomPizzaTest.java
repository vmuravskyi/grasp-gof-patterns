package gof.design.patterns.gof.foxminded.decorator;

import gof.design.patterns.gof.foxminded.decorator.pizza.LargePizza;
import gof.design.patterns.gof.foxminded.decorator.pizza.MushroomPizza;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MushroomPizzaTest {

    @Test
    void cook() {
        var pizza = new MushroomPizza(new LargePizza());
        assertEquals("mushroom large pizza", pizza.cook());
    }

}
