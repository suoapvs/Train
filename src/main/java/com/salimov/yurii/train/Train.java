package com.salimov.yurii.train;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * The class describes the train entity.
 *
 * @author Yurii Salimov (yurii.alex.salimov@gmail.com)
 * @version 1.0
 * @see ITrain
 * @see IWagon
 */
public final class Train implements ITrain {

    /**
     * The object of Random class is used to generate
     * a stream of pseudorandom numbers.
     */
    private final static Random RANDOM = new Random();

    /**
     * The train length (number of wagons).
     */
    private final int length;

    /**
     * The list of train wagons.
     */
    private final List<IWagon> wagons;

    /**
     * The number of current wagon.
     */
    private int currentWagonNumber;

    /**
     * The value, if the train ready for use.
     */
    private boolean isReady;

    /**
     * Constructor.
     *
     * @param length a train length (number of wagons).
     */
    public Train(final int length) {
        this.length = length > 0 ? length : 0;
        this.wagons = new ArrayList<>(length);
    }

    /**
     * Returns the train length.
     *
     * @return The train length.
     */
    @Override
    public int getLength() {
        return this.length;
    }

    /**
     * Returns a list of train wagons.
     *
     * @return The list of train wagons.
     */
    @Override
    public List<IWagon> getWagons() {
        if (!this.isReady) {
            addRandomWagons(this.wagons, this.length);
            this.isReady = true;
        }
        return this.wagons;
    }

    /**
     * Returns a wagon with number.
     *
     * @param number a wagon number.
     * @return The wagon.
     */
    @Override
    public IWagon getWagon(final int number) {
        if (number >= this.length) {
            this.currentWagonNumber = number - this.length;
        } else if (number < 0) {
            this.currentWagonNumber = number + this.length;
        } else {
            this.currentWagonNumber = number;
        }
        return getWagons().get(this.currentWagonNumber);
    }

    /**
     * Returns a current wagon.
     *
     * @return The current wagon.
     */
    @Override
    public IWagon getCurrentWagon() {
        return getWagon(this.currentWagonNumber);
    }

    /**
     * Returns a next wagon.
     *
     * @return The next wagon.
     */
    @Override
    public IWagon getNextWagon() {
        return getWagon(this.currentWagonNumber + 1);
    }

    /**
     * Returns a previous wagon.
     *
     * @return The previous wagon.
     */
    @Override
    public IWagon getPreviousWagon() {
        return getWagon(this.currentWagonNumber - 1);
    }

    /**
     * Returns a list of train wagons with random lamp state.
     *
     * @param wagons a list of train wagons.
     * @param length a train length (number of wagons).
     * @return The list of train wagons with random lamp state.
     */
    private static List<IWagon> addRandomWagons(
            final List<IWagon> wagons,
            final int length
    ) {
        for (int i = 0; i < length; i++) {
            wagons.add(
                    getRandomWagon(i)
            );
        }
        return wagons;
    }

    /**
     * Returns a wagon with random lamp state.
     *
     * @param number a wagon number.
     * @return The wagon with random lamp state.
     */
    private static IWagon getRandomWagon(int number) {
        return new Wagon(
                number,
                new Lamp(
                        RANDOM.nextBoolean()
                )
        );
    }
}
