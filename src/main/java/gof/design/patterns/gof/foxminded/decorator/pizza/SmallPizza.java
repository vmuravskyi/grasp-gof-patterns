package gof.design.patterns.gof.foxminded.decorator.pizza;

public class SmallPizza implements CookablePizza {

    @Override
    public String cook() {
        return "small pizza";
    }

}
