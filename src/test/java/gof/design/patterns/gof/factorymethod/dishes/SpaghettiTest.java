package gof.design.patterns.gof.factorymethod.dishes;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static junit.framework.Assert.assertEquals;

class SpaghettiTest {

    @Test
    void shouldCalculateSpaghettiCookingTime() {
        Spaghetti spaghetti = new Spaghetti();

        assertEquals(20, spaghetti.calculateEstimatedCookingTime(1D));
        assertEquals(
                LocalDateTime.of(2024, 1, 1, 12, 20),
                spaghetti.calculateReadyTime(LocalDateTime.of(2024, 1, 1, 12, 0))
        );
    }

}
