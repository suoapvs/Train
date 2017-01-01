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
        this.train.getWagon(
                this.startWagonNumber
        ).setState(true);
        int number = this.startWagonNumber;
        while (true) {
            int plus = 0;
            int temp = number + 1 < train.getLength() ? number + 1 : 0;
            while (
                    !train.getWagon(temp)
                            .getState()
                    ) {
                plus++;
                temp = temp + 1 < train.getLength() ? temp + 1 : 0;
            }
            train.getWagon(temp)
                    .setState(false);
            if (
                    !train.getWagon(number)
                            .getState()
                    ) {
                number = plus + 1;
                break;
            }
        }
        this.length = number;
    }
}
