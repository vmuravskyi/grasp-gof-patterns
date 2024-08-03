package gof.design.patterns.gof.foxminded.flyweight.army;

import gof.design.patterns.gof.foxminded.flyweight.army.Army;
import gof.design.patterns.gof.foxminded.flyweight.army.Soldier;
import gof.design.patterns.gof.foxminded.flyweight.army.Tank;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class ArmyTest {

    @Test
    void shouldAddSoldiers() {
        var army = new Army();
        var texture = new byte[100];
        var sound = new byte[100];
        army.addSoldiers(100, texture, sound, "lieutenant");
        assertEquals(100, army.getUnits().size());
        army.getUnits().forEach(unit -> assertInstanceOf(Soldier.class, unit));
    }

    @Test
    void shouldAddTanks() {
        var army = new Army();
        var texture = new byte[100];
        var sound = new byte[100];
        army.addTanks(2, texture, sound, "T-100");
        assertEquals(2, army.getUnits().size());
        army.getUnits().forEach(unit -> assertInstanceOf(Tank.class, unit));
    }

    @Test
    void shouldMove() {
        var army = new Army();
        army.move(100, 100);
        assertTrue(army.getxCoordinate() == 100 && army.getyCoordinate() == 100);
    }

    @Test
    void shouldAttack() {
        var army = new Army();
        var  mockSoldier = mock(Soldier.class);
        var mockTank = mock(Tank.class);
        army.getUnits().add(mockSoldier);
        army.getUnits().add(mockTank);

        army.attack();

        verify(mockSoldier, times(1)).attack();
        verify(mockTank, times(1)).attack();
    }
}
