package gof.design.patterns.gof.strategy.sorting;

import java.util.List;

public interface SortStrategy {

    <T extends Comparable<T>> void sort(List<T> a);

}
