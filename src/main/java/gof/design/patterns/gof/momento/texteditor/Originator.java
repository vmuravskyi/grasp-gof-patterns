package gof.design.patterns.gof.momento.texteditor;

public class Originator {

    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memorable save() {
        return new Memento(state);
    }

    public void restore(Memorable memento) {
        state = memento.getState();
    }

    private class Memento implements Memorable {

        private String state;

        public Memento(String state) {
            this.state = state;
        }

        @Override
        public String getState() {
            return this.state;
        }
    }

}
