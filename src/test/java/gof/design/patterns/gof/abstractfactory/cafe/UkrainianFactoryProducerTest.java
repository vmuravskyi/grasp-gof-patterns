package gof.design.patterns.gof.abstractfactory.cafe;

import gof.design.patterns.gof.abstractfactory.dishes.CuisineType;
import gof.design.patterns.gof.abstractfactory.dishes.Meal;
import gof.design.patterns.gof.abstractfactory.dishes.UkrainianComboMeal;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class UkrainianFactoryProducerTest {

    @Test
    public void shouldCreateUkrainianComboMeal() {
        NationalCuisineAbstractFactory ukrainianMenu = CafeFactoryProducer.getNationalCuisineFactory(CuisineType.UKRAINIAN);
        Meal ukrainianMeal = ukrainianMenu.cookComboMeal();
        assertEquals(UkrainianComboMeal.class, ukrainianMeal.getClass());
    }

}
