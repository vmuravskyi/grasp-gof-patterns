package gof.design.patterns.gof.foxminded.factorymethod.dishes;

public class Borscht extends Dish {

    private static final CuisineType CUISINE_TYPE = CuisineType.UKRAINIAN;
    private static final long DEFAULT_COOKING_TIME = 90;
    private static final long BOILING_MEAT_TIME = 30;

    public static CuisineType getCuisineType() {
        return CUISINE_TYPE;
    }

    @Override
    public long calculateEstimatedCookingTime(double kitchenBusyRate) {
        long estimatedCookingTime = BOILING_MEAT_TIME + (long) (DEFAULT_COOKING_TIME * kitchenBusyRate);
        setEstimatedCookingTime(estimatedCookingTime);
        return getEstimatedCookingTime();
    }

}
