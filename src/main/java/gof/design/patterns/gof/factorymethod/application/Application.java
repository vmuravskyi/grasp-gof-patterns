package gof.design.patterns.gof.factorymethod.application;

import gof.design.patterns.gof.factorymethod.dishes.CuisineType;
import gof.design.patterns.gof.factorymethod.kitchen.OvenFactory;

import java.time.LocalDateTime;

public class Application {

    public static void main(String[] args) {

        var ukranianDish = OvenFactory.createDish(CuisineType.UKRAINIAN, 1.0D);
        ukranianDish.printReadyTime(LocalDateTime.now());

        var italianDish = OvenFactory.createDish(CuisineType.ITALIAN, 1.0D);
        italianDish.printReadyTime(LocalDateTime.now());

        var japaneseDish = OvenFactory.createDish(CuisineType.JAPANESE, 1.0D);
        japaneseDish.printReadyTime(LocalDateTime.now());

    }

}
