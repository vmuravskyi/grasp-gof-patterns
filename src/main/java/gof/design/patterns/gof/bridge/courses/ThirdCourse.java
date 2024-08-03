package gof.design.patterns.gof.bridge.courses;

import gof.design.patterns.gof.bridge.cafe.Cuisine;

public class ThirdCourse extends Course {

    public ThirdCourse(Cuisine cuisine) {
        super(cuisine);
    }

    @Override
    public void cook() {
        this.cuisine.cookThirdCourse();
    }

}
