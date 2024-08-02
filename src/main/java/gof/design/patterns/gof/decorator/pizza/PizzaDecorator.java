package gof.design.patterns.gof.decorator.pizza;

public class PizzaDecorator implements CookablePizza {

    private CookablePizza pizza;

    public PizzaDecorator(CookablePizza pizza) {
        this.pizza = pizza;
    }

    public String cook() {
        return pizza.cook();
    }

}
