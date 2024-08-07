package gof.design.patterns.gof.strategy.sorting;

import java.util.List;

public class QuickSortStrategy implements SortStrategy {

    private static <T extends Comparable<T>> void quickSort(List<T> list, int i, int j) {
        if (i < j) {
            int l = partition(list, i, j);
            quickSort(list, i, l);
            quickSort(list, l + 1, j);
        }
    }

    private static <T extends Comparable<T>> int partition(List<T> list, int p, int q) {
        T x = list.get(p);
        int m = (p + q) / 2;
        if ((list.get(p).compareTo(list.get(m)) <= 0 && list.get(m).compareTo(list.get(q)) <= 0)
            || (list.get(q).compareTo(list.get(m)) <= 0 && list.get(m).compareTo(list.get(p)) <= 0))
            x = list.get(m);
        if ((list.get(p).compareTo(list.get(q)) <= 0 && list.get(q).compareTo(list.get(m)) <= 0)
            || (list.get(m).compareTo(list.get(q)) <= 0 && list.get(q).compareTo(list.get(p)) <= 0))
            x = list.get(q);
        int i = p - 1;
        int j = q + 1;
        while (true) {
            do i++; while (!(i > q || list.get(i).compareTo(x) >= 0));
            do j--; while (!(j < p || list.get(j).compareTo(x) <= 0));
            if (i < j) swap(list, i, j);
            else return j;
        }
    }

    private static <T extends Comparable<T>> void swap(List<T> list, int i, int j) {
        T x;
        x = list.get(i);
        list.set(i, list.get(j));
        list.set(j, x);
    }

    @Override
    public <T extends Comparable<T>> void sort(List<T> list) {
        quickSort(list, 0, list.size() - 1);
    }

}
