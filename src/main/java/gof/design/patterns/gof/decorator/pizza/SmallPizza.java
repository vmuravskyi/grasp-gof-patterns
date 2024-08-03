package gof.design.patterns.gof.decorator.pizza;

public class SmallPizza implements CookablePizza {

    @Override
    public String cook() {
        return "small pizza";
    }

}
