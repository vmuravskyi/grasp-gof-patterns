package gof.design.patterns.gof.bridge.courses;

import gof.design.patterns.gof.bridge.cafe.Cuisine;

public class MainCourse extends Course {

    public MainCourse(Cuisine cuisine) {
        super(cuisine);
    }

    @Override
    public void cook() {
        this.cuisine.cookMainCourse();
    }

}
