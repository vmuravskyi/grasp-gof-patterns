package gof.design.patterns.gof.adapter.cafe;

import gof.design.patterns.gof.adapter.cuisine.ChineseCuisineAdapter;
import gof.design.patterns.gof.adapter.cuisine.CuisineType;
import gof.design.patterns.gof.adapter.cuisine.VietnameseCuisineAdapter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CuisineFactoryTest {

    @Test
    void shouldCreateCuisine() {
        var chineseCuisine = CuisineFactory.createCuisine(CuisineType.CHINESE);
        assertEquals(ChineseCuisineAdapter.class, chineseCuisine.getClass());

        var vietnameseCuisine = CuisineFactory.createCuisine(CuisineType.VIETNAMESE);
        assertEquals(VietnameseCuisineAdapter.class, vietnameseCuisine.getClass());
    }

}