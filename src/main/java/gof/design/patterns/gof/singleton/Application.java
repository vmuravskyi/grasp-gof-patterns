package gof.design.patterns.gof.singleton;

public class Application {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            var coin = MagicCoin.getInstance();
            System.out.println("Coin with face value: " + coin.getFaceValue());
        }
    }

}
