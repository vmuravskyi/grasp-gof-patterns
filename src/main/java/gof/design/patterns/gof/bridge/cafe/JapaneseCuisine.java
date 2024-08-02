package gof.design.patterns.gof.bridge.cafe;

public class JapaneseCuisine implements Cuisine {

    @Override
    public void cookStarter() {
        System.out.println("Miso Soup");
    }

    @Override
    public void cookMainCourse() {
        System.out.println("Tempura");
    }

    @Override
    public void cookThirdCourse() {
        System.out.println("Seaweed Salad");
    }

    @Override
    public void cookDessert() {
        System.out.println("Mochi ice cream ");
    }

}
