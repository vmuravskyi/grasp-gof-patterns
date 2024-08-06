package gof.design.patterns.gof.momento.texteditor;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {

    private List<Memorable> stateHistory = new ArrayList<>();

    public void addState(Memorable state) {
        stateHistory.add(state);
    }

    public Memorable getStateByIndex(int index) {
        return stateHistory.get(index);
    }

}
