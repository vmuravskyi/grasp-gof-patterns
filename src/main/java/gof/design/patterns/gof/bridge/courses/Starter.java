package gof.design.patterns.gof.bridge.courses;

import gof.design.patterns.gof.bridge.cafe.Cuisine;

public class Starter extends Course {

    public Starter(Cuisine cuisine) {
        super(cuisine);
    }

    @Override
    public void cook() {
        this.cuisine.cookStarter();
    }

}
