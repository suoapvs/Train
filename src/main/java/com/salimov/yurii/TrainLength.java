package com.salimov.yurii;

public class TrainLength {

    private final Train train;
    private int length;
    private boolean direction;

    public TrainLength(final Train train) {
        this.train = train;
    }

    public Train getTrain() {
        return this.train;
    }

    public int getLength() {
        if ((this.train != null) && (this.length == 0)) {
            calculateLength();
        }
        return this.length;
    }

    private void calculateLength() {
        Wagon startWagon = this.train.getWagon(0);
        startWagon.onLamp();
        while (true) {
            getLengthInDirection();
            this.train.getCurrentWagon().offLamp();
            startWagon = moveToStartWagon();
            if (!startWagon.getLampState()) {
                break;
            }
            this.direction = !this.direction;
        }
    }

    private int getLengthInDirection() {
        this.length = 1;
        if (this.direction) {
            while (!this.train.getNextWagon().getLampState()) {
                this.length++;
            }
        } else {
            while (!this.train.getPrevWagon().getLampState()) {
                this.length++;
            }
        }
        return this.length;
    }

    private Wagon moveToStartWagon() {
        Wagon wagon = null;
        if (this.length > 0) {
            if (this.direction) {
                for (int i = 0; i < this.length; i++) {
                    wagon = this.train.getPrevWagon();
                }
            } else {
                for (int i = 0; i < this.length; i++) {
                    wagon = this.train.getNextWagon();
                }
            }
        } else {
            wagon = this.train.getCurrentWagon();
        }
        return wagon;
    }
}
