package gof.design.patterns.gof.abstractfactory.cafe;

import gof.design.patterns.gof.abstractfactory.dishes.CuisineType;
import gof.design.patterns.gof.abstractfactory.dishes.ItalianComboMeal;
import gof.design.patterns.gof.abstractfactory.dishes.Meal;
import org.junit.jupiter.api.Test;

import static junit.framework.Assert.assertEquals;

class ItalianCuisineFactoryTest {

    @Test
    void shouldCreateItalianComboMeal() {
        NationalCuisineAbstractFactory italianMenu = CafeFactoryProducer.getNationalCuisineFactory(CuisineType.ITALIAN);
        Meal italianMeal = italianMenu.cookComboMeal();
        assertEquals(ItalianComboMeal.class, italianMeal.getClass());
    }

}
