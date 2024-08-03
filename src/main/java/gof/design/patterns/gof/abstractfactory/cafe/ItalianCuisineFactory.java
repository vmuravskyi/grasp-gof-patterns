package gof.design.patterns.gof.abstractfactory.cafe;

import gof.design.patterns.gof.abstractfactory.dishes.ItalianComboMeal;
import gof.design.patterns.gof.abstractfactory.dishes.Meal;

public class ItalianCuisineFactory implements NationalCuisineAbstractFactory {

    @Override
    public Meal cookComboMeal() {
        return new ItalianComboMeal();
    }

}
