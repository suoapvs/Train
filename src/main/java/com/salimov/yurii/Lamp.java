package com.salimov.yurii;

public class Lamp {

    private boolean state;

    public Lamp() {

    }

    public Lamp(final boolean state) {
        this.state = state;
    }

    public boolean getState() {
        return this.state;
    }

    public boolean on() {
        return (this.state = true);
    }

    public boolean off() {
        return (this.state = false);
    }
}
