package gof.design.patterns.gof.momento.texteditor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class OriginatorTest {

    @Test
    void shouldRestoreState() {
        Originator originator = new Originator();
        Caretaker careTaker = new Caretaker();

        originator.setState("#1 version");
        careTaker.addState(originator.save());

        originator.setState("#2 version");
        careTaker.addState(originator.save());

        originator.restore(careTaker.getStateByIndex(0));
        assertEquals("#1 version", originator.getState());
    }

}