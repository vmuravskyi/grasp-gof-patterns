package gof.design.patterns.gof.abstractfactory.dishes;

public class ItalianComboMeal implements Meal {

    @Override
    public void printCookingStatus() {
        System.out.println("Italian combo meal is cooked");
    }

}
