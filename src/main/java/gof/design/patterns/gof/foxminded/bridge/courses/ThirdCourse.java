package gof.design.patterns.gof.foxminded.bridge.courses;

import gof.design.patterns.gof.foxminded.bridge.cafe.Cuisine;

public class ThirdCourse extends Course {

    public ThirdCourse(Cuisine cuisine) {
        super(cuisine);
    }

    @Override
    public void cook() {
        this.cuisine.cookThirdCourse();
    }

}
