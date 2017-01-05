package com.salimov.yurii;

/**
 * The class describes the lamp entity.
 *
 * @author Yurii Salimov (yurii.alex.salimov@gmail.com)
 * @version 1.0
 */
public final class Lamp {

    /**
     * The lamp state.
     * {@code true} if lamp is turned on,
     * {@code false} otherwise.
     */
    private boolean state;

    /**
     * Constructor.
     */
    public Lamp() {
    }

    /**
     * Constructor.
     *
     * @param state a lamp state.
     */
    public Lamp(final boolean state) {
        this();
        this.state = state;
    }

    /**
     * Returns a lamp state.
     *
     * @return {@code true} if lamp is turned on,
     * {@code false} otherwise.
     */
    public boolean getState() {
        return this.state;
    }

    /**
     * Turns on a lamp.
     *
     * @return The lamp state.
     */
    public boolean on() {
        return (this.state = true);
    }

    /**
     * Turns off a lamp.
     *
     * @return The lamp state.
     */
    public boolean off() {
        return (this.state = false);
    }
}
