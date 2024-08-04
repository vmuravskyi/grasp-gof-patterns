package gof.design.patterns.gof.interpreter.kitchen;

public abstract class CookPizzaCommand implements CookCommand {

    private int quantity;

    public int getQuantity() {
        return quantity;
    }

    @Override
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}
