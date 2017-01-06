package com.salimov.yurii.train;

import org.junit.Ignore;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @author Yurii Salimov (yurii.alex.salimov@gmail.com)
 * @version 1.0
 */
public class TrainTest {

    @Test
    public void whenCreateTrainWithNegativeLengthThenSetZero() {
        final ITrain train = new Train(-10);
        assertEquals(train.getLength(), 0);
    }

    @Test
    public void whenCreateTrainWithPositiveLengthThenSetIt() {
        final ITrain train = new Train(10);
        assertEquals(train.getLength(), 10);
    }

    @Test
    public void whenTrainIsNotReadyPrepareItAndReturn() {
        final ITrain train = new Train(10);
        final List wagons1 = train.getWagons();
        assertNotNull(wagons1);
        assertFalse(wagons1.isEmpty());
        assertEquals(wagons1.size(), 10);
        final List wagons2 = train.getWagons();
        assertEquals(wagons1, wagons2);
    }

    @Test
    public void whenGetWagonByNumberGreatThanTrainLengthThenCorrectItAndGetWagon() {
        final ITrain train = new Train(10);
        notNullWagon(train, 11);
        notNullWagon(train, 100);
    }

    @Test
    public void whenGetWagonByNumberLeasThanZeroThenCorrectItAndGetWagon() {
        final ITrain train = new Train(10);
        notNullWagon(train, -10);
        notNullWagon(train, -100);
    }

    @Test
    public void whenGetWagonWithNormalNumberThenReturnIt() {
        final ITrain train = new Train(10);
        notNullWagon(train, 3);
        notNullWagon(train, 5);
        notNullWagon(train, 7);
    }

    @Test
    public void whenGetNextWagonThenReturnIt() {
        final ITrain train = new Train(10);
        final IWagon nextWagon1 = train.getNextWagon();
        assertNotNull(nextWagon1);
        final IWagon nextWagon2 = train.getNextWagon();
        assertNotEquals(nextWagon1, nextWagon2);
    }

    @Test
    public void whenGetPreviousWagonThenReturnIt() {
        final ITrain train = new Train(10);
        final IWagon prevWagon1 = train.getPreviousWagon();
        assertNotNull(prevWagon1);
        final IWagon prevWagon2 = train.getPreviousWagon();
        assertNotEquals(prevWagon1, prevWagon2);
    }

    @Test
    public void whenGetCurrentWagonThenReturnIt() {
        final ITrain train = new Train(10);
        final IWagon currentWagon1 = train.getCurrentWagon();
        assertNotNull(currentWagon1);
        final IWagon currentWagon2 = train.getCurrentWagon();
        assertEquals(currentWagon1, currentWagon2);
        final IWagon nextWagon = train.getNextWagon();
        assertNotEquals(currentWagon1, nextWagon);
        final IWagon currentWagon3 = train.getCurrentWagon();
        assertEquals(currentWagon3, nextWagon);
        assertNotEquals(currentWagon1, currentWagon3);
    }

    @Ignore
    private void notNullWagon(final ITrain train, final int number) {
        final IWagon wagon = train.getWagon(number);
        assertNotNull(wagon);
    }
}
