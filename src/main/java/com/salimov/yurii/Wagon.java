package com.salimov.yurii;

public class Wagon {

    private boolean state;
    private int number;

    public Wagon(
            final int number,
            final boolean state
    ) {
        this.number = number;
        this.state = state;
    }

    public int getNumber() {
        return this.number;
    }

    public void setNumber(final int number) {
        this.number = number;
    }

    public boolean getState() {
        return this.state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public boolean reversState() {
        return (this.state = !this.state);
    }
}