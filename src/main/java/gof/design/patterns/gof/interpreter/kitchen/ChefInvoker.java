package gof.design.patterns.gof.interpreter.kitchen;

import gof.design.patterns.gof.interpreter.pizza.Pizza;

public class ChefInvoker {

    private static final String COOK_TOKEN = "cook";
    private static final String MAKE_TOKEN = "make";
    private static final String BACON_TOKEN = "bacon";
    private static final String CHEESE_TOKEN = "cheese";
    private static final String PINEAPPLE_TOKEN = "pineapple";
    private static final String MUSHROOM_TOKEN = "mushroom";
    private static final String SEAFOOD_TOKEN = "seafood";

    private CookPizzaBaseCommand cookRecipeCommand;

    private static boolean isInteger(String token) {
        try {
            Integer.parseInt(token);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    public void setCookRecipeCommand(CookPizzaBaseCommand cookRecipeCommand) {
        this.cookRecipeCommand = cookRecipeCommand;
    }

    public CookCommand addCookCommand(CookCommand cookCommand) throws InterpreterCookingPizzaException {
        if (this.cookRecipeCommand == null) {
            throw new InterpreterCookingPizzaException("Cook commands is not defined");
        }
        return this.cookRecipeCommand.addCommand(cookCommand);
    }

    public Pizza cookPizza(String recipe) throws InterpreterCookingPizzaException {

        var tokens = recipe.split(" ");
        CookCommand currentExpression = null;

        for (var token : tokens) {
            if (token.equalsIgnoreCase(COOK_TOKEN) || token.equalsIgnoreCase(MAKE_TOKEN)) {
                var cook = new CookPizzaBaseCommand();
                this.setCookRecipeCommand(cook);
                currentExpression = cook;
            } else if (token.equalsIgnoreCase(BACON_TOKEN)) {
                currentExpression = this.addCookCommand(new AddBaconCommand());
            } else if (token.equalsIgnoreCase(CHEESE_TOKEN)) {
                currentExpression = this.addCookCommand(new AddCheeseCommand());
            } else if (token.equalsIgnoreCase(PINEAPPLE_TOKEN)) {
                currentExpression = this.addCookCommand(new AddPineappleCommand());
            } else if (token.equalsIgnoreCase(MUSHROOM_TOKEN)) {
                currentExpression = this.addCookCommand(new AddMushroomCommand());
            } else if (token.equalsIgnoreCase(SEAFOOD_TOKEN)) {
                currentExpression = this.addCookCommand(new AddSeafoodCommand());
            } else if (isInteger(token) && currentExpression != null) {
                currentExpression.setQuantity(Integer.parseInt(token));
            }
        }

        if (this.cookRecipeCommand == null) {
            throw new InterpreterCookingPizzaException("Cook commands is not defined");
        }

        return cookRecipeCommand.cook(new Pizza());
    }

}
