package gof.design.patterns.gof.adapter.cafe;

import gof.design.patterns.gof.adapter.cuisine.ChineseCuisineAdapter;
import gof.design.patterns.gof.adapter.cuisine.CuisineAdapter;
import gof.design.patterns.gof.adapter.cuisine.CuisineType;
import gof.design.patterns.gof.adapter.cuisine.VietnameseCuisineAdapter;

public class CuisineFactory {

    private CuisineFactory() {
        // private constructor
    }

    public static CuisineAdapter createCuisine(CuisineType cuisineType) {
        return switch (cuisineType) {
            case VIETNAMESE -> new VietnameseCuisineAdapter();
            case CHINESE -> new ChineseCuisineAdapter();
            default -> throw new IllegalArgumentException("Unknown cuisine type");
        };
    }

}
