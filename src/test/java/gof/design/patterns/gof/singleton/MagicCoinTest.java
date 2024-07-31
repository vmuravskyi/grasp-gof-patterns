package gof.design.patterns.gof.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MagicCoinTest {

    @Test
    void shouldReturnCoinWithCorrectFaceValueAndThrowException() {
        for (int i = 0; i < 10; i++) {
            MagicCoin coin = MagicCoin.getInstance();
            assertNotNull(coin, "Coin should not be null");
            assertEquals(i, coin.getFaceValue(), "Face value should match");
        }

        assertThrows(RuntimeException.class, MagicCoin::getInstance);
    }

}