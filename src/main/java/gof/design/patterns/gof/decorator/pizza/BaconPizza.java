package gof.design.patterns.gof.decorator.pizza;

public class BaconPizza extends PizzaDecorator {

    public BaconPizza(CookablePizza pizza) {
        super(pizza);
    }

    @Override
    public String cook() {
        return cookBaconPizza() + super.cook();
    }

    private String cookBaconPizza() {
        return "bacon ";
    }

}
