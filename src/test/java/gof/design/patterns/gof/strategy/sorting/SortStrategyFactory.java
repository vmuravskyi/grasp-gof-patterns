package gof.design.patterns.gof.strategy.sorting;

public class SortStrategyFactory {

    public static SortStrategy getStrategy(boolean isCollectionAlmostSorted) {
        if (isCollectionAlmostSorted) {
            return new BubbleSortStrategy();
        } else {
            return new QuickSortStrategy();
        }
    }

}
