package gof.design.patterns.gof.foxminded.factorymethod.dishes;

public class Spaghetti extends Dish {

    private static final CuisineType CUISINE_TYPE = CuisineType.ITALIAN;
    private static final long DEFAULT_COOKING_TIME = 20;

    public static CuisineType getCuisineType() {
        return CUISINE_TYPE;
    }

    @Override
    public long calculateEstimatedCookingTime(double kitchenBusyRate) {
        long estimatedCookingTime = (long) (DEFAULT_COOKING_TIME * kitchenBusyRate);
        setEstimatedCookingTime(estimatedCookingTime);
        return getEstimatedCookingTime();
    }

}
