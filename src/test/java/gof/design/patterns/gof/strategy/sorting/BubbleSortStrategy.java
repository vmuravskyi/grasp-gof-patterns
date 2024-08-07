package gof.design.patterns.gof.strategy.sorting;

import java.util.List;

public class BubbleSortStrategy implements SortStrategy {

    private static <T extends Comparable<T>> void bubblesort(List<T> list) {
        int n = list.size();
        while (n > 0) {
            int lastModifiedIndex = 0;
            for (int currentIndex = 1; currentIndex < n; currentIndex++) {
                if (list.get(currentIndex - 1).compareTo(list.get(currentIndex)) > 0) {
                    swap(list, currentIndex - 1, currentIndex);
                    lastModifiedIndex = currentIndex;
                }
            }
            n = lastModifiedIndex;
        }
    }

    private static <T extends Comparable<T>> void swap(List<T> list, int i, int j) {
        T x;
        x = list.get(i);
        list.set(i, list.get(j));
        list.set(j, x);
    }

    @Override
    public <T extends Comparable<T>> void sort(List<T> array) {
        bubblesort(array);
    }

}
