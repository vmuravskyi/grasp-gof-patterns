package gof.design.patterns.gof.abstractfactory.cafe;

import gof.design.patterns.gof.abstractfactory.dishes.CuisineType;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

public class CafeFactoryProducerTest {

    @Test
    public void shouldCreateItalianMenu() {
        NationalCuisineAbstractFactory italianMenu = CafeFactoryProducer.getNationalCuisineFactory(CuisineType.ITALIAN);
        assertTrue(italianMenu instanceof ItalianCuisineFactory);
        assertEquals(ItalianCuisineFactory.class, italianMenu.getClass());
    }

    @Test
    public void shouldCreateJapaneseMenu() {
        NationalCuisineAbstractFactory japaneseMenu = CafeFactoryProducer.getNationalCuisineFactory(CuisineType.JAPANESE);
        assertEquals(JapaneseCuisineFactory.class, japaneseMenu.getClass());
    }

    @Test
    public void shouldCreateUkrainianMenu() {
        NationalCuisineAbstractFactory ukrainianMenu = CafeFactoryProducer.getNationalCuisineFactory(CuisineType.UKRAINIAN);
        assertEquals(UkrainianCuisineFactory.class, ukrainianMenu.getClass());
    }

}
