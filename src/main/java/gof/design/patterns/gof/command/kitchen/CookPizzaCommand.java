package gof.design.patterns.gof.command.kitchen;

public abstract class CookPizzaCommand implements CookCommand {

    private int quantity;

    protected CookPizzaCommand(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

}
