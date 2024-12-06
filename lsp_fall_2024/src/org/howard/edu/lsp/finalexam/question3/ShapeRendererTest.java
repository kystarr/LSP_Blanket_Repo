package org.howard.edu.lsp.finalexam.question3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ShapeRendererTest {

    @Test
    public void testCircleRendering() {
        ShapeRenderer renderer = new ShapeRenderer();
        // Test rendering a circle
        renderer.renderShape("circle");
    }

    @Test
    public void testRectangleRendering() {
        ShapeRenderer renderer = new ShapeRenderer();
        // Test rendering a rectangle
        renderer.renderShape("rectangle");
    }

    @Test
    public void testTriangleRendering() {
        ShapeRenderer renderer = new ShapeRenderer();
        // Test rendering a triangle
        renderer.renderShape("triangle");
    }

    @Test
    public void testUnknownShapeRendering() {
        ShapeRenderer renderer = new ShapeRenderer();
        // Test rendering an unknown shape
        renderer.renderShape("hexagon");  // Expected output: Unknown shape type: hexagon
    }

    @Test
    public void testSingletonShapeFactory() {
        ShapeFactory factory1 = ShapeFactory.getInstance();
        ShapeFactory factory2 = ShapeFactory.getInstance();

        // Assert that both factory instances are the same (singleton behavior)
        assertSame(factory1, factory2, "ShapeFactory should be a singleton!");
    }
}


//I used ChatGPT to help write this code

