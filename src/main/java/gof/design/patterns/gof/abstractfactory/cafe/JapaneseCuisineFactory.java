package gof.design.patterns.gof.abstractfactory.cafe;

import gof.design.patterns.gof.abstractfactory.dishes.JapaneseComboMeal;
import gof.design.patterns.gof.abstractfactory.dishes.Meal;

public class JapaneseCuisineFactory implements NationalCuisineAbstractFactory {

    @Override
    public Meal cookComboMeal() {
        return new JapaneseComboMeal();
    }

}
