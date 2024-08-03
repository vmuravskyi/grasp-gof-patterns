package gof.design.patterns.gof.foxminded.abstractfactory.cafe;

import gof.design.patterns.gof.foxminded.abstractfactory.cafe.CafeFactoryProducer;
import gof.design.patterns.gof.foxminded.abstractfactory.cafe.NationalCuisineAbstractFactory;
import gof.design.patterns.gof.foxminded.abstractfactory.dishes.CuisineType;
import gof.design.patterns.gof.foxminded.abstractfactory.dishes.JapaneseComboMeal;
import gof.design.patterns.gof.foxminded.abstractfactory.dishes.Meal;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class JapaneseCuisineFactoryTest {

    @Test
    void shouldCreateJapaneseComboMeal() {
        NationalCuisineAbstractFactory japaneseMenu = CafeFactoryProducer.getNationalCuisineFactory(CuisineType.JAPANESE);
        Meal japaneseMeal = japaneseMenu.cookComboMeal();
        assertEquals(JapaneseComboMeal.class, japaneseMeal.getClass());
    }

}
