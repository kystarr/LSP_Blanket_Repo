package org.howard.lsp.finalexam.question3;


public class ShapeFactory {
    private static ShapeFactory instance;

    // Private constructor to prevent instantiation from outside
    private ShapeFactory() {}

    // Static method to get the singleton instance of the factory
    public static ShapeFactory getInstance() {
        if (instance == null) {
            instance = new ShapeFactory();
        }
        return instance;
    }

    // Factory method to create shapes based on shapeType
    public Shape getShape(String shapeType) {
        if (shapeType.equalsIgnoreCase("circle")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("rectangle")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("triangle")) {
            return new Triangle();
        } else {
            System.out.println("Unknown shape type: " + shapeType);
            return null;
        }
    }
}

//I used ChatGPT to help write this code