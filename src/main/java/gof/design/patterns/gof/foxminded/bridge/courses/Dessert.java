package gof.design.patterns.gof.foxminded.bridge.courses;

import gof.design.patterns.gof.foxminded.bridge.cafe.Cuisine;

public class Dessert extends Course {

    public Dessert(Cuisine cuisine) {
        super(cuisine);
    }

    @Override
    public void cook() {
        this.cuisine.cookDessert();
    }

}
