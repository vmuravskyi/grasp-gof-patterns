package gof.design.patterns.gof.foxminded.factorymethod.dishes;

import gof.design.patterns.gof.foxminded.factorymethod.dishes.Sushi;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;


class SushiTest {

    @Test
    void shouldCalculateSushiCookingTime() {
        Sushi sushi = new Sushi();

        assertEquals(45, sushi.calculateEstimatedCookingTime(1D));
        assertEquals(LocalDateTime.of(2024, 1, 1, 12, 45), sushi.calculateReadyTime(LocalDateTime.of(2024, 1, 1, 12, 0)));
    }

}
