package gof.design.patterns.gof.composite.tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LeafTest {

    @Test
    void shouldIncrement() {
        var leaf = new Leaf(5);
        leaf.increment();
        assertEquals(6, leaf.getValue());
    }

    @Test
    void shouldDecrement() {
        var leaf = new Leaf(5);
        leaf.decrement();
        assertEquals(4, leaf.getValue());
    }

    @Test
    void shouldCalculateSum() {
        var leaf = new Leaf(5);
        assertEquals(5, leaf.getValue());
    }

}