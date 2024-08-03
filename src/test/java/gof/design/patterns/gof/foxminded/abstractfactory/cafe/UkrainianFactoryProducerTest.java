package gof.design.patterns.gof.foxminded.abstractfactory.cafe;

import gof.design.patterns.gof.foxminded.abstractfactory.cafe.CafeFactoryProducer;
import gof.design.patterns.gof.foxminded.abstractfactory.cafe.NationalCuisineAbstractFactory;
import gof.design.patterns.gof.foxminded.abstractfactory.dishes.CuisineType;
import gof.design.patterns.gof.foxminded.abstractfactory.dishes.Meal;
import gof.design.patterns.gof.foxminded.abstractfactory.dishes.UkrainianComboMeal;
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
