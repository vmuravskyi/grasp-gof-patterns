package gof.design.patterns.gof.composite.tree;

public class Leaf implements CalculableElement {

    private int value;

    public Leaf(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public int increment() {
        return ++this.value;
    }

    public int decrement() {
        return --this.value;
    }

    @Override
    public int sum() {
        return this.getValue();
    }

}
