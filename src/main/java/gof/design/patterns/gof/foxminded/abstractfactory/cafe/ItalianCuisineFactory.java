package gof.design.patterns.gof.foxminded.abstractfactory.cafe;

import gof.design.patterns.gof.foxminded.abstractfactory.dishes.ItalianComboMeal;
import gof.design.patterns.gof.foxminded.abstractfactory.dishes.Meal;

public class ItalianCuisineFactory implements NationalCuisineAbstractFactory {

    @Override
    public Meal cookComboMeal() {
        return new ItalianComboMeal();
    }

}
