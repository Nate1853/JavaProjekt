package de.hska.iwi.ads.solution.interfaces;


import de.hska.iwi.ads.interfaces.Vector;
import de.hska.iwi.ads.interfaces.VectorTest;

public class CartesianVectorTest extends VectorTest {

    @Override
    public Vector createVector(double x, double y) {
        CartesianVector v = new CartesianVector();
        return v;
    }
}