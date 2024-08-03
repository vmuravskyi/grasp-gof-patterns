package gof.design.patterns.gof.bridge.cafe;

public class AmericanCuisine implements Cuisine {

    @Override
    public void cookStarter() {
        System.out.println("Cesar salad");
    }

    @Override
    public void cookMainCourse() {
        System.out.println("Burger");
    }

    @Override
    public void cookThirdCourse() {
        System.out.println("Nuggets");
    }

    @Override
    public void cookDessert() {
        System.out.println("Ice cream");
    }

}
