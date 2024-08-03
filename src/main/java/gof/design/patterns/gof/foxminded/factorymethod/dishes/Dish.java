package gof.design.patterns.gof.foxminded.factorymethod.dishes;

import java.time.LocalDateTime;

public abstract class Dish {

    static final CuisineType CUISINE_TYPE = CuisineType.UNDEFINED;
    private long estimatedCookingTime = 0;

    public abstract long calculateEstimatedCookingTime(double kitchenBusyRate);

    public long getEstimatedCookingTime() {
        return estimatedCookingTime;
    }

    public void setEstimatedCookingTime(long estimatedCookingTime) {
        this.estimatedCookingTime = estimatedCookingTime;
    }

    public void printReadyTime(LocalDateTime currentTime) {
        LocalDateTime readyTime = calculateReadyTime(currentTime);
        System.out.printf("%s will be ready at %s%n", this.getClass().getSimpleName(), readyTime);
    }

    public LocalDateTime calculateReadyTime(LocalDateTime currentTime) {
        return currentTime.plusMinutes(getEstimatedCookingTime());
    }

}
