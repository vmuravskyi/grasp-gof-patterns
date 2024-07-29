package gof.design.patterns.gof.factorymethod.kitchen;

import gof.design.patterns.gof.factorymethod.dishes.*;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class OvenFactoryTest {

    @Test
    public void shouldCreateNationalDishes() {
        Dish ukrainianDish = OvenFactory.createDish(CuisineType.UKRAINIAN, 1.5D);
        assertEquals(Borscht.class, ukrainianDish.getClass());

        Dish japaniseDish = OvenFactory.createDish(CuisineType.JAPANESE, 2.0D);
        assertEquals(Sushi.class, japaniseDish.getClass());

        Dish italianDish = OvenFactory.createDish(CuisineType.ITALIAN, 3.5D);
        assertEquals(Spaghetti.class, italianDish.getClass());
    }

}