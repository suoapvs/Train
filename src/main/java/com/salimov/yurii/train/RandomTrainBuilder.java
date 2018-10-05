package com.salimov.yurii.train;

import java.util.Random;

public final class RandomTrainBuilder {

    private final static int MAX_LENGTH = 1000;

    private final Random random = new Random();
    private int length;
    private WagonImpl first;

    public RandomTrainBuilder createTrain() {
        this.length = generateLength();
        this.first = createWagon();
        WagonImpl last = this.first;
        for (int i = 1; i < this.length; i++) {
            final WagonImpl current = createWagon();
            current.setPrev(last);
            last = current;
        }
        last.setNext(this.first);
        return this;
    }

    public Wagon getWagon() {
        if (this.first == null) {
            createTrain();
        }
        return this.first;
    }

    public int getLength() {
        return this.length;
    }

    private int generateLength() {
        return Math.abs(this.random.nextInt(MAX_LENGTH));
    }

    private WagonImpl createWagon() {
        return new WagonImpl(createLamp());
    }

    private Lamp createLamp() {
        return new LampImpl(this.random.nextBoolean());
    }
}
