package gof.design.patterns.gof.decorator.pizza;

public class CheesePizza extends PizzaDecorator {

    public CheesePizza(CookablePizza pizza) {
        super(pizza);
    }

    @Override
    public String cook() {
        return cookCheesePizza() + super.cook();
    }

    private String cookCheesePizza() {
        return "cheese ";
    }

}
