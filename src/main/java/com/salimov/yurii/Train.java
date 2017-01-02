package com.salimov.yurii;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Train {

    private final static Random RANDOM = new Random();
    private final int length;
    private final List<Wagon> wagons;
    private int currentWagonNumber;
    private boolean isReady;

    public Train(final int length) {
        this.length = length > 0 ? length : 0;
        this.wagons = new ArrayList<>();
        this.isReady = false;
    }

    public int getLength() {
        return this.length;
    }

    public List<Wagon> getWagons() {
        if (!this.isReady) {
            addRandomWagons(this.wagons, this.length);
            this.isReady = true;
        }
        return this.wagons;
    }

    public Wagon getWagon(final int number) {
        if (number >= this.length) {
            this.currentWagonNumber = number - this.length;
        } else if (number < 0) {
            this.currentWagonNumber = number + this.length;
        } else {
            this.currentWagonNumber = number;
        }
        return getWagons().get(this.currentWagonNumber);
    }

    public Wagon getCurrentWagon() {
        return getWagon(this.currentWagonNumber);
    }

    public Wagon getNextWagon() {
        return getWagon(this.currentWagonNumber + 1);
    }

    public Wagon getPrevWagon() {
        return getWagon(this.currentWagonNumber - 1);
    }

    private static List<Wagon> addRandomWagons(
            final List<Wagon> wagons,
            final int length
    ) {
        for (int i = 0; i < length; i++) {
            wagons.add(
                    getRandomWagon(i)
            );
        }
        return wagons;
    }


    private static Wagon getRandomWagon(int number) {
        return new Wagon(
                number,
                new Lamp(
                        RANDOM.nextBoolean()
                )
        );
    }
}
