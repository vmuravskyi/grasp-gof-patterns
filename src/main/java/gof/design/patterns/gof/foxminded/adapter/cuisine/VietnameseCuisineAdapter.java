package gof.design.patterns.gof.foxminded.adapter.cuisine;

public class VietnameseCuisineAdapter implements CuisineAdapter {

    private final VietnameseCuisine cuisine;

    public VietnameseCuisineAdapter() {
        this.cuisine = new VietnameseCuisine();
    }

    @Override
    public void cook() {
        this.cuisine.cookVietnameseNoodle();
    }

    @Override
    public void order() {
        this.cuisine.orderVietnameseNoodle();
    }

}
