package com.salimov.yurii;

public class TrainLength {

    private final Train train;
    private final int startWagonNumber;
    private int length;

    public TrainLength(
            final Train train,
            final int startWagonNumber
    ) {
        this.train = train;
        this.startWagonNumber = startWagonNumber;
    }

    public TrainLength(final Train train) {
        this(train, 0);
    }

    public Train getTrain() {
        return this.train;
    }

    public int getLength() {
        if (this.train != null && this.length == 0) {
            calculateLength();
        }
        return this.length;
    }

    private void calculateLength() {
        this.train.getWagon(this.startWagonNumber).onLamp();
        boolean direction = true;
        while(true) {
            final int length = getLengthInDirection(direction);
            this.train.getCurrentWagon().offLamp();
            if(!this.train.getWagon(this.startWagonNumber).getLampState()) {
                this.length = length;
                break;
            }
            direction = !direction;
        }
    }

    private int getLengthInDirection(final boolean toRight) {
        int length = 1;
        if (toRight) {
            while (!this.train.getNextWagon().getLampState()) {
                length++;
            }
        } else {
            while (!this.train.getPrevWagon().getLampState()) {
                length++;
            }
        }
        return length;
    }
}
