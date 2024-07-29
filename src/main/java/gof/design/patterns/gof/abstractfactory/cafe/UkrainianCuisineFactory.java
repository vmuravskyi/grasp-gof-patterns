package gof.design.patterns.gof.abstractfactory.cafe;

import gof.design.patterns.gof.abstractfactory.dishes.Meal;
import gof.design.patterns.gof.abstractfactory.dishes.UkrainianComboMeal;

public class UkrainianCuisineFactory implements NationalCuisineAbstractFactory {

    @Override
    public Meal cookComboMeal() {
        return new UkrainianComboMeal();
    }

}
