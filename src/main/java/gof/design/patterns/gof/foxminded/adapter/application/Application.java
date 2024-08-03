package gof.design.patterns.gof.foxminded.adapter.application;

import gof.design.patterns.gof.foxminded.adapter.cafe.CuisineFactory;
import gof.design.patterns.gof.foxminded.adapter.cuisine.CuisineType;

public class Application {

    public static void main(String[] args) {

        var chineseCuisine = CuisineFactory.createCuisine(CuisineType.CHINESE);
        chineseCuisine.cook();
        chineseCuisine.order();

        var vietnameseCuisine = CuisineFactory.createCuisine(CuisineType.VIETNAMESE);
        vietnameseCuisine.cook();
        vietnameseCuisine.order();

    }

}
