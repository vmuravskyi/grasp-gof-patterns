package gof.design.patterns.gof.foxminded.decorator.pizza;

public class SeafoodPizza extends PizzaDecorator {

    public SeafoodPizza(CookablePizza pizza) {
        super(pizza);
    }

    @Override
    public String cook() {
        return cookSeafoodPizza() + super.cook();
    }

    private String cookSeafoodPizza() {
        return "seafood ";
    }

}
