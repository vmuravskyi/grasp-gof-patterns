package gof.design.patterns.gof.singleton;

import java.util.ArrayList;
import java.util.List;

public class MagicCoin {

    private static final int MAXIMUM_COINS_NUMBER = 10;
    private static final List<MagicCoin> magicCoins = new ArrayList<MagicCoin>(MAXIMUM_COINS_NUMBER);
    private static int coinsCounter = 0;
    private int faceValue = 0;

    static {
        for (int i = 0; i < MAXIMUM_COINS_NUMBER; i++) {
            magicCoins.add(i, new MagicCoin(i));
        }
    }

    private MagicCoin(int faceValue) {
        this.faceValue = faceValue;
    }

    public int getFaceValue() {
        return faceValue;
    }

    public static synchronized MagicCoin getInstance() {
        if (coinsCounter < MAXIMUM_COINS_NUMBER) {
            var coin = magicCoins.get(coinsCounter);
            coinsCounter++;
            return coin;
        }
        throw new RuntimeException("Out of new coins.");
    }

}
