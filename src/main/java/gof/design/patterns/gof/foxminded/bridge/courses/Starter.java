package gof.design.patterns.gof.foxminded.bridge.courses;

import gof.design.patterns.gof.foxminded.bridge.cafe.Cuisine;

public class Starter extends Course {

    public Starter(Cuisine cuisine) {
        super(cuisine);
    }

    @Override
    public void cook() {
        this.cuisine.cookStarter();
    }

}
