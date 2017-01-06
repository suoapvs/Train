package com.salimov.yurii;

import java.util.List;

/**
 * The interface describes the methods for working with train.
 *
 * @author Yurii Salimov (yurii.alex.salimov@gmail.com)
 * @version 1.0
 * @see IWagon
 */
public interface ITrain {

    /**
     * Returns the train length.
     *
     * @return The train length.
     */
    int getLength();

    /**
     * Returns a list of train wagons.
     *
     * @return The list of train wagons.
     */
    List<IWagon> getWagons();

    /**
     * Returns a wagon with number.
     *
     * @param number a wagon number.
     * @return The wagon.
     */
    IWagon getWagon(final int number);

    /**
     * Returns a current wagon.
     *
     * @return The current wagon.
     */
    IWagon getCurrentWagon();

    /**
     * Returns a next wagon.
     *
     * @return The next wagon.
     */
    IWagon getNextWagon();

    /**
     * Returns a previous wagon.
     *
     * @return The previous wagon.
     */
    IWagon getPreviousWagon();
}
