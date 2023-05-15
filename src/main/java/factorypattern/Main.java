package factorypattern;

public class Main {
    public static void main(String[] args) {
        // Create a ShapeFactory object to get the objects of the desired shapes
        ShapeFactory shapeFactory = new ShapeFactory();

        // Get a Circle object from the ShapeFactory and calling its draw() method
        Shape circle = shapeFactory.getShape("Circle");
        circle.draw();

        // Get a Rectangle object from the ShapeFactory and calling its draw() method
        Shape rectangle = shapeFactory.getShape("Rectangle");
        rectangle.draw();

        // Get a Square object from the ShapeFactory and calling its draw() method
        Shape square = shapeFactory.getShape("Square");
        square.draw();
    }
}

