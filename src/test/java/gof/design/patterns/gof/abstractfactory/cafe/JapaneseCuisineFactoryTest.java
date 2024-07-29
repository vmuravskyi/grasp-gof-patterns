package gof.design.patterns.gof.abstractfactory.cafe;

import gof.design.patterns.gof.abstractfactory.dishes.CuisineType;
import gof.design.patterns.gof.abstractfactory.dishes.JapaneseComboMeal;
import gof.design.patterns.gof.abstractfactory.dishes.Meal;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class JapaneseCuisineFactoryTest {

    @Test
    public void shouldCreateJapaneseComboMeal() {
        NationalCuisineAbstractFactory japaneseMenu = CafeFactoryProducer.getNationalCuisineFactory(CuisineType.JAPANESE);
        Meal japaneseMeal = japaneseMenu.cookComboMeal();
        assertEquals(JapaneseComboMeal.class, japaneseMeal.getClass());
    }

}
