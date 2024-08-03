package gof.design.patterns.gof.foxminded.decorator.pizza;

public class PineapplePizza extends PizzaDecorator {

    public PineapplePizza(CookablePizza pizza) {
        super(pizza);
    }

    @Override
    public String cook() {
        return cookPineapplePizza() + super.cook();
    }

    private String cookPineapplePizza() {
        return "pineapple ";
    }

}
