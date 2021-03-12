package de.hska.iwi.ads.solution.interfaces;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * A few simple tests for Circle.
 * <p>
 * Use {@link Circle#Circle(double)} to create a Circle instance.
 */
class CircleTest {

    /**
     * Create a Circle with a negative radius -10.0.
     * Check with a try-catch-statement
     * that the constructor throws an IllegalArgumentException.
     */
    @Test
    void testCircleDouble() {
        try {
            Circle circle = new Circle(-10);
        } catch (IllegalArgumentException argumentException) {
            System.out.println("Es hat funktioniert");
        }

        // fail("Not yet implemented");
    }

    /*
     * Create a Circle with radius 1.5.
     * Scale it by a factor of 2.0.
     * Check that afterwards the Circle
     * has a radius near 3.0.
     */
    @Test
    void testScale1() {
        Circle circle = new Circle(1.5);
        circle.scale(2.0);
        System.out.println(circle.getDimension());
        // fail("Not yet implemented");
    }

    /*
     * Create a Circle with radius 1.0.
     * Check that the area is nearly Math.PI.
     */
    @Test
    void testArea1() {
        Circle circle = new Circle(1.0);
        if (circle.area() == Math.PI) {
            System.out.println("JA");
        } else {
            System.out.println("Nein");
        }
        // fail("Not yet implemented");
    }

    /*
     * Create a Circle with radius 2.0.
     * Check that the area is nearly 4.0 * Math.PI.
     */
    @Test
    void testArea2() {
        Circle circle = new Circle(2.0);
        System.out.println("Area: " + circle.area() + " || 4*Math.PI: " + 4 * Math.PI);
        if (circle.area() == 4 * Math.PI) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
            // fail("Not yet implemented");
        }
    }

    /*
     * Create a Circle with radius 1.0.
     * Check that the radius is near 1.0.
     */
    @Test
    void testGetRadius1() {
        Circle circle = new Circle(1.0);
        System.out.println(circle.getRadius());
        // fail("Not yet implemented");
    }

}
