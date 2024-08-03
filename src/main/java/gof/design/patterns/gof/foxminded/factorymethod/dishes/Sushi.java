package gof.design.patterns.gof.foxminded.factorymethod.dishes;

public class Sushi extends Dish {

    private static final CuisineType CUISINE_TYPE = CuisineType.JAPANESE;
    private static final long DEFAULT_COOKING_TIME = 45;

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
