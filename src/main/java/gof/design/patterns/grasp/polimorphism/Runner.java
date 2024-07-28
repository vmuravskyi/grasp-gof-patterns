package gof.design.patterns.grasp.polimorphism;

public class Runner {

    public static void main(String[] args) {

//        IShape object = new Circle();
        IShape object = new Square();

        IShape shape = new Circle();

        drawShape(shape);
    }

    private static void drawShape(IShape shape) {
        shape.draw();
    }

}
