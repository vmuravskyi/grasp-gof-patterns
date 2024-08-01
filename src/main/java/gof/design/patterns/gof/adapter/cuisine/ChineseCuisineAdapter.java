package gof.design.patterns.gof.adapter.cuisine;

public class ChineseCuisineAdapter implements CuisineAdapter {

    private final ChineseCuisine cuisine;

    public ChineseCuisineAdapter() {
        this.cuisine = new ChineseCuisine();
    }

    @Override
    public void cook() {
        this.cuisine.cookPekingDuck();
    }

    @Override
    public void order() {
        this.cuisine.orderPekingDuck();
    }

}
