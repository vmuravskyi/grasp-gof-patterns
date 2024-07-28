package gof.design.patterns.grasp.polimorphism;

public class Runner {

    public static void main(String[] args) {

        IShape shape = new Circle();
//        IShape shape = new Square();

        drawShape(shape);
    }

    private static void drawShape(IShape shape) {
        shape.draw();
    }

}
