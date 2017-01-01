package com.salimov.yurii;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Train {

    private final static Random RANDOM = new Random();
    private final int length;
    private List<Wagon> wagons;
    private boolean isReady;

    public Train(final int length) {
        this.length = length > 0 ? length : 0;
        this.isReady = false;
    }

    public int getLength() {
        return this.length;
    }

    public List<Wagon> getWagons() {
        checkTrain(this);
        return this.wagons;
    }

    public Wagon getWagon(
            final int number
    ) {
        return getWagons().get(number);
    }

    private static void checkTrain(final Train train) {
        if (!train.isReady) {
            train.wagons = createTrain(train.length);
            train.isReady = true;
        }
    }

    private static List<Wagon> createTrain(int length) {
        List<Wagon> wagons = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            wagons.add(
                    new Wagon(
                            i,
                            RANDOM.nextBoolean()
                    )
            );
        }
        return wagons;
    }
}
