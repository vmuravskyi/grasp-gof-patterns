package gof.design.patterns.gof.bridge.courses;

import gof.design.patterns.gof.bridge.cafe.Cuisine;

public class Dessert extends Course {

    public Dessert(Cuisine cuisine) {
        super(cuisine);
    }

    @Override
    public void cook() {
        this.cuisine.cookDessert();
    }

}
