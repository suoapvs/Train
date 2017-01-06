package com.salimov.yurii;

/**
 * The interface describes a method for
 * calculating the length of a train.
 *
 * @author Yurii Salimov (yurii.alex.salimov@gmail.com)
 * @version 1.0
 * @see ITrain
 */
public interface ICalculateLength {

    /**
     * Returns a train.
     *
     * @return The train.
     * @see ITrain
     */
    ITrain getTrain();

    /**
     * Returns a calculated train length.
     *
     * @return The train length.
     */
    int getLength();
}
