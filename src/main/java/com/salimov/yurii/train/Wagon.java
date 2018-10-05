package com.salimov.yurii.train;

public interface Wagon {

    boolean isLight();

    boolean onLamp();

    boolean offLamp();

    Wagon next();

    Wagon prev();
}
