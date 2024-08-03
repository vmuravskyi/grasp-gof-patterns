package gof.design.patterns.gof.foxminded.abstractfactory.cafe;

import gof.design.patterns.gof.foxminded.abstractfactory.dishes.JapaneseComboMeal;
import gof.design.patterns.gof.foxminded.abstractfactory.dishes.Meal;

public class JapaneseCuisineFactory implements NationalCuisineAbstractFactory {

    @Override
    public Meal cookComboMeal() {
        return new JapaneseComboMeal();
    }

}
