package gof.design.patterns.gof.foxminded.bridge.cafe;

public class UkrainianCuisine implements Cuisine {

    @Override
    public void cookStarter() {
        System.out.println("Borscht");
    }

    @Override
    public void cookMainCourse() {
        System.out.println("Holubtsi");
    }

    @Override
    public void cookThirdCourse() {
        System.out.println("Varenyky");
    }

    @Override
    public void cookDessert() {
        System.out.println("Sochnyky");
    }

}
