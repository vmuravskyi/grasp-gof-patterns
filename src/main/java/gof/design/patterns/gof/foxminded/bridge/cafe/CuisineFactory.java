package gof.design.patterns.gof.foxminded.bridge.cafe;

public class CuisineFactory {

    private CuisineFactory() {
        // private constructor
    }

    public static Cuisine getCuisine(CuisineType type) {
        return switch (type) {
            case AMERICAN -> new AmericanCuisine();
            case JAPANESE -> new JapaneseCuisine();
            case UKRAINIAN -> new UkrainianCuisine();
            default -> throw new IllegalArgumentException(String.format("Cuisine type %s does not exist", type));
        };
    }

}
