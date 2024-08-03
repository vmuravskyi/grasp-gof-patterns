package gof.design.patterns.gof.abstractfactory.cafe;

import gof.design.patterns.gof.abstractfactory.dishes.CuisineType;

public class CafeFactoryProducer {

    public static NationalCuisineAbstractFactory getNationalCuisineFactory(CuisineType type) {
        return switch (type) {
            case ITALIAN -> new ItalianCuisineFactory();
            case JAPANESE -> new JapaneseCuisineFactory();
            case UKRAINIAN -> new UkrainianCuisineFactory();
            default -> throw new IllegalArgumentException("There's no factory for cuisine type: " + type);
        };
    }

}
