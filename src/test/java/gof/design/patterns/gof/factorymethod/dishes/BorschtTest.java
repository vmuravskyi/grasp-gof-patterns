package gof.design.patterns.gof.factorymethod.dishes;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static junit.framework.Assert.assertEquals;

class BorschtTest {

    @Test
    void shouldCalculateBorschtCookingTime() {
        Borscht borscht = new Borscht();

        assertEquals(120, borscht.calculateEstimatedCookingTime(1D));
        assertEquals(
                LocalDateTime.of(2024, 1, 1, 14, 0),
                borscht.calculateReadyTime(LocalDateTime.of(2024, 1, 1, 12, 0))
        );
    }

}
