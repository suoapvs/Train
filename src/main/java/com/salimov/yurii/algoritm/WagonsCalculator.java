package com.salimov.yurii.algoritm;

import com.salimov.yurii.train.Wagon;

public final class WagonsCalculator {

    private Wagon wagon;
    private boolean direction;

    public WagonsCalculator(final Wagon firstWagon) {
        this.wagon = firstWagon;
    }

    public int calcLength() {
        this.wagon.onLamp();
        int length;
        while (true) {
            length = searchNextLightWagon();
            if (!goBackAt(length).isLight()) {
                break;
            }
            this.direction = !this.direction;
        }
        return length;
    }

    private int searchNextLightWagon() {
        final int length = goToAnotherLightWagon();
        this.wagon.offLamp();
        return length;
    }

    private int goToAnotherLightWagon() {
        return this.direction ? goToNextLightWagon() : goToPrevLightWagon();
    }

    private int goToNextLightWagon() {
        int length = 0;
        do {
            length++;
        } while (!toNext().isLight());
        return length;
    }

    private int goToPrevLightWagon() {
        int length = 0;
        do {
            length++;
        } while (!toPrev().isLight());
        return length;
    }

    private Wagon goBackAt(final int wagonNumbers) {
        for (int i = 0; i < wagonNumbers; i++) {
            if (this.direction) {
                toPrev();
            } else {
                toNext();
            }
        }
        return this.wagon;
    }

    private Wagon toNext() {
        return this.wagon = this.wagon.next();
    }

    private Wagon toPrev() {
        return this.wagon = this.wagon.prev();
    }
}
