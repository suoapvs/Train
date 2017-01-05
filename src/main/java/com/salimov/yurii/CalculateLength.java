package com.salimov.yurii;

public final class CalculateLength {

    private final Train train;
    private int length;
    private boolean direction;

    public CalculateLength(final Train train) {
        this.train = train;
    }

    public Train getTrain() {
        return this.train;
    }

    public int get() {
        if ((this.train != null) && (this.length == 0)) {
            calculate();
        }
        return this.length;
    }

    private void calculate() {
        Wagon startWagon = this.train.getWagon(0);
        startWagon.onLamp();
        while (true) {
            getInDirection();
            this.train.getCurrentWagon().offLamp();
            startWagon = moveToStartWagon();
            if (!startWagon.getLampState()) {
                break;
            }
            this.direction = !this.direction;
        }
    }

    private int getInDirection() {
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
