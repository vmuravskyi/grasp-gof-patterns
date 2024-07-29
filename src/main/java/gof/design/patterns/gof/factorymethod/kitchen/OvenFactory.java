package gof.design.patterns.gof.factorymethod.kitchen;

import gof.design.patterns.gof.factorymethod.dishes.*;

public class OvenFactory {

    public static Dish createDish(CuisineType cuisineType, double busyRate) {
        Dish dish = switch (cuisineType) {
            case ITALIAN -> new Spaghetti();
            case JAPANESE -> new Sushi();
            case UKRAINIAN -> new Borscht();
            default -> throw new IllegalArgumentException("Unknown cuisine type");
        };
        dish.calculateEstimatedCookingTime(busyRate);
        return dish;
    }

}
