package gof.design.patterns.gof.abstractfactory.cafe;

import gof.design.patterns.gof.abstractfactory.cafe.CafeFactoryProducer;
import gof.design.patterns.gof.abstractfactory.cafe.NationalCuisineAbstractFactory;
import gof.design.patterns.gof.abstractfactory.dishes.CuisineType;
import gof.design.patterns.gof.abstractfactory.dishes.ItalianComboMeal;
import gof.design.patterns.gof.abstractfactory.dishes.Meal;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ItalianCuisineFactoryTest {

    @Test
    void shouldCreateItalianComboMeal() {
        NationalCuisineAbstractFactory italianMenu = CafeFactoryProducer.getNationalCuisineFactory(CuisineType.ITALIAN);
        Meal italianMeal = italianMenu.cookComboMeal();
        assertEquals(ItalianComboMeal.class, italianMeal.getClass());
    }

}
