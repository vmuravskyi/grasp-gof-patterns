package gof.design.patterns.gof.foxminded.composite.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.function.ToIntFunction;

public class Node implements CalculableElement {

    private final List<CalculableElement> childElements = new ArrayList<CalculableElement>();
    private int value;

    public Node(int value) {
        this.value = value;
    }

    public int sum() {
        return this.value + calculateOperationOnChildElements(CalculableElement::sum);
    }

    public int increment() {
        this.value++;
        return this.value + calculateOperationOnChildElements(CalculableElement::increment);
    }

    public int decrement() {
        this.value--;
        return this.value + calculateOperationOnChildElements(CalculableElement::decrement);
    }

    private int calculateOperationOnChildElements(ToIntFunction<CalculableElement> mapper) {
        return this.childElements.stream().mapToInt(mapper).sum();
    }

    public Leaf addLeaf(int initialValue) {
        var newLeaf = new Leaf(initialValue);
        this.childElements.add(newLeaf);
        return newLeaf;
    }

    public Node addNode(int initialValue) {
        var newNode = new Node(initialValue);
        this.childElements.add(newNode);
        return newNode;
    }

    public void remove(CalculableElement element) {
        this.childElements.removeIf(v -> v.equals(element));
    }

    public int getValue() {
        return value;
    }

    public Node setValue(int value) {
        this.value = value;
        return this;
    }

}
