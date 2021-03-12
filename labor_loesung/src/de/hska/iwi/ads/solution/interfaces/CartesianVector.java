package de.hska.iwi.ads.solution.interfaces;

import de.hska.iwi.ads.interfaces.Vector;

public class CartesianVector implements Vector {

    public CartesianVector() {
    }

    @Override
    public double getX() {
        return 0;
    }

    @Override
    public double getY() {
        return 0;
    }

    @Override
    public double getDirection() {
        return Math.atan2(getY(),getX());
    }

    @Override
    public Vector add(Vector addend) {
        return null;
    }

    @Override
    public void scale(double factor) {

    }

    @Override
    public double getDimension() {
        return 0;
    }
}
