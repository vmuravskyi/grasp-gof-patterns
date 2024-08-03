package gof.design.patterns.gof.abstractfactory.application;

import gof.design.patterns.gof.abstractfactory.cafe.CafeFactoryProducer;
import gof.design.patterns.gof.abstractfactory.cafe.NationalCuisineAbstractFactory;
import gof.design.patterns.gof.abstractfactory.dishes.CuisineType;
import gof.design.patterns.gof.abstractfactory.dishes.Meal;

public class Application {

    public static void main(String[] args) {
        NationalCuisineAbstractFactory italianMenu = CafeFactoryProducer.getNationalCuisineFactory(CuisineType.ITALIAN);
        Meal italianMeal = italianMenu.cookComboMeal();
        italianMeal.printCookingStatus();

        NationalCuisineAbstractFactory japaneseMenu = CafeFactoryProducer.getNationalCuisineFactory(CuisineType.JAPANESE);
        Meal japaneseMeal = japaneseMenu.cookComboMeal();
        japaneseMeal.printCookingStatus();

        NationalCuisineAbstractFactory ukrainianMenu = CafeFactoryProducer.getNationalCuisineFactory(CuisineType.UKRAINIAN);
        Meal ukrainianMeal = ukrainianMenu.cookComboMeal();
        ukrainianMeal.printCookingStatus();
    }

}
