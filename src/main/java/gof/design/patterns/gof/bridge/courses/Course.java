package gof.design.patterns.gof.bridge.courses;

import gof.design.patterns.gof.bridge.cafe.Cuisine;

public abstract class Course implements Cookable {

    protected Cuisine cuisine;

    protected Course(Cuisine cuisine) {
        this.cuisine = cuisine;
    }

}
