package gof.design.patterns.gof.foxminded.abstractfactory.cafe;

import gof.design.patterns.gof.foxminded.abstractfactory.dishes.Meal;
import gof.design.patterns.gof.foxminded.abstractfactory.dishes.UkrainianComboMeal;

public class UkrainianCuisineFactory implements NationalCuisineAbstractFactory {

    @Override
    public Meal cookComboMeal() {
        return new UkrainianComboMeal();
    }

}
