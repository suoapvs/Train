package com.salimov.yurii.train;

/**
 * The interface describes the methods for working with wagon.
 *
 * @author Yurii Salimov (yurii.alex.salimov@gmail.com)
 * @version 1.0
 * @see ILamp
 */
public interface IWagon {

    /**
     * Returns a wagon number.
     *
     * @return The wagon number.
     */
    int getNumber();

    /**
     * Sets a wagon number.
     *
     * @param number a wagon number.
     */
    void setNumber(final int number);

    /**
     * Returns a wagon lamp state.
     *
     * @return The wagon lamp state.
     */
    boolean getLampState();

    /**
     * Turns on a wagon lamp.
     *
     * @return The lamp state.
     */
    boolean onLamp();

    /**
     * Turns off a wagon lamp.
     *
     * @return The lamp state.
     */
    boolean offLamp();

    /**
     * Toggle a wagon lamp state.
     *
     * @return The lamp state.
     */
    boolean turnLamp();
}
