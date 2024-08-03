package gof.design.patterns.gof.foxminded.abstractfactory.cafe;

import gof.design.patterns.gof.foxminded.abstractfactory.cafe.CafeFactoryProducer;
import gof.design.patterns.gof.foxminded.abstractfactory.cafe.NationalCuisineAbstractFactory;
import gof.design.patterns.gof.foxminded.abstractfactory.dishes.CuisineType;
import gof.design.patterns.gof.foxminded.abstractfactory.dishes.ItalianComboMeal;
import gof.design.patterns.gof.foxminded.abstractfactory.dishes.Meal;
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
