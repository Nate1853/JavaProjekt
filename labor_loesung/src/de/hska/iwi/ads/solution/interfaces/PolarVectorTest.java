package de.hska.iwi.ads.solution.interfaces;

import de.hska.iwi.ads.interfaces.Vector;
import de.hska.iwi.ads.interfaces.VectorTest;

public class PolarVectorTest extends VectorTest {

    @Override
    public Vector createVector(double x, double y) {
        return new PolarVector();
    }
}
