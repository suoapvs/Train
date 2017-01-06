package com.salimov.yurii;

/**
 * The class describes the lamp entity.
 *
 * @author Yurii Salimov (yurii.alex.salimov@gmail.com)
 * @version 1.0
 * @see ILamp
 */
public final class Lamp implements ILamp {

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
    @Override
    public boolean getState() {
        return this.state;
    }

    /**
     * Turns on a lamp.
     *
     * @return The lamp state.
     */
    @Override
    public boolean on() {
        return (this.state = true);
    }

    /**
     * Turns off a lamp.
     *
     * @return The lamp state.
     */
    @Override
    public boolean off() {
        return (this.state = false);
    }
}
