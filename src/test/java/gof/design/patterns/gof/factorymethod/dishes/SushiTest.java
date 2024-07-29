package gof.design.patterns.gof.factorymethod.dishes;


import org.junit.Test;

import java.time.LocalDateTime;

import static junit.framework.Assert.assertEquals;

public class SushiTest {

    @Test
    public void shouldCalculateSushiCookingTime() {
        Sushi sushi = new Sushi();

        assertEquals(45, sushi.calculateEstimatedCookingTime(1D));
        assertEquals(
                LocalDateTime.of(2024, 1, 1, 12, 45),
                sushi.calculateReadyTime(LocalDateTime.of(2024, 1, 1, 12, 0))
        );
    }

}
