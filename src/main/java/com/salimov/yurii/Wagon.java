package com.salimov.yurii;

public final class Wagon {

    private int number;
    private Lamp lamp;

    public Wagon(
            final int number,
            final Lamp lamp
    ) {
        this.number = number;
        this.lamp = lamp;
    }

    public Wagon(final int number) {
        this(number, new Lamp());
    }

    public int getNumber() {
        return this.number;
    }

    public void setNumber(final int number) {
        this.number = number;
    }

    public boolean getLampState() {
        return this.lamp.getState();
    }

    public boolean onLamp() {
        return this.lamp.on();
    }

    public boolean offLamp() {
        return this.lamp.off();
    }

    public boolean turnLamp() {
        return getLampState() ? offLamp() : onLamp();
    }
}