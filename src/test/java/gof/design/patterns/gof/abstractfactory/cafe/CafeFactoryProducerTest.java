package gof.design.patterns.gof.abstractfactory.cafe;

import gof.design.patterns.gof.abstractfactory.dishes.CuisineType;
import org.junit.jupiter.api.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

class CafeFactoryProducerTest {

    @Test
    void shouldCreateItalianMenu() {
        NationalCuisineAbstractFactory italianMenu = CafeFactoryProducer.getNationalCuisineFactory(CuisineType.ITALIAN);
        assertTrue(italianMenu instanceof ItalianCuisineFactory);
        assertEquals(ItalianCuisineFactory.class, italianMenu.getClass());
    }

    @Test
    void shouldCreateJapaneseMenu() {
        NationalCuisineAbstractFactory japaneseMenu = CafeFactoryProducer.getNationalCuisineFactory(CuisineType.JAPANESE);
        assertEquals(JapaneseCuisineFactory.class, japaneseMenu.getClass());
    }

    @Test
    void shouldCreateUkrainianMenu() {
        NationalCuisineAbstractFactory ukrainianMenu = CafeFactoryProducer.getNationalCuisineFactory(CuisineType.UKRAINIAN);
        assertEquals(UkrainianCuisineFactory.class, ukrainianMenu.getClass());
    }

}
