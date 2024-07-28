package gof.design.patterns.grasp.polimorphism;

public class Circle implements IShape {

    @Override
    public void draw() {
        System.out.println("Circle");
    }

}
