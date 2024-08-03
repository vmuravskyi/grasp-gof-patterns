package gof.design.patterns.gof.foxminded.bridge.courses;

import gof.design.patterns.gof.foxminded.bridge.cafe.Cuisine;

public abstract class Course implements Cookable {

    protected Cuisine cuisine;

    protected Course(Cuisine cuisine) {
        this.cuisine = cuisine;
    }

}
