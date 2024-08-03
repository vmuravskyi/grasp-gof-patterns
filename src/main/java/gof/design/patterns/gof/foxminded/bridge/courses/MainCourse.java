package gof.design.patterns.gof.foxminded.bridge.courses;

import gof.design.patterns.gof.foxminded.bridge.cafe.Cuisine;

public class MainCourse extends Course {

    public MainCourse(Cuisine cuisine) {
        super(cuisine);
    }

    @Override
    public void cook() {
        this.cuisine.cookMainCourse();
    }

}
