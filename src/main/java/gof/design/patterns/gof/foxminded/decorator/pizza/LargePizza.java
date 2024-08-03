package gof.design.patterns.gof.foxminded.decorator.pizza;

public class LargePizza implements CookablePizza {

    @Override
    public String cook() {
        return "large pizza";
    }

}
