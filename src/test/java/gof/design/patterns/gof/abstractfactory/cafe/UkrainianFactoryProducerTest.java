package gof.design.patterns.gof.abstractfactory.cafe;

import gof.design.patterns.gof.abstractfactory.cafe.CafeFactoryProducer;
import gof.design.patterns.gof.abstractfactory.cafe.NationalCuisineAbstractFactory;
import gof.design.patterns.gof.abstractfactory.dishes.CuisineType;
import gof.design.patterns.gof.abstractfactory.dishes.Meal;
import gof.design.patterns.gof.abstractfactory.dishes.UkrainianComboMeal;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UkrainianFactoryProducerTest {

    @Test
    void shouldCreateUkrainianComboMeal() {
        NationalCuisineAbstractFactory ukrainianMenu = CafeFactoryProducer.getNationalCuisineFactory(CuisineType.UKRAINIAN);
        Meal ukrainianMeal = ukrainianMenu.cookComboMeal();
        assertEquals(UkrainianComboMeal.class, ukrainianMeal.getClass());
    }

}
