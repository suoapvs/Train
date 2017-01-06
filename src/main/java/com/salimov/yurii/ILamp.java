package com.salimov.yurii;

/**
 * The interface describes the methods for working with lamp.
 *
 * @author Yurii Salimov (yurii.alex.salimov@gmail.com)
 * @version 1.0
 */
public interface ILamp {

    /**
     * Returns a lamp state.
     *
     * @return {@code true} if lamp is turned on,
     * {@code false} otherwise.
     */
    boolean getState();

    /**
     * Turns on a lamp.
     *
     * @return The lamp state.
     */
    boolean on();

    /**
     * Turns off a lamp.
     *
     * @return The lamp state.
     */
    boolean off();
}
