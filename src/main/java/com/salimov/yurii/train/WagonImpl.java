package com.salimov.yurii.train;

final class WagonImpl implements Wagon {

    private static int counter = 0;
    private final int number;
    private Lamp lamp;
    private Wagon next = this;
    private Wagon prev = this;

    WagonImpl(final Lamp lamp) {
        this.number = counter++;
        this.lamp = lamp;
    }

    @Override
    public boolean equals(final Object object) {
        if (this == object) {
            return true;
        }
        if ((object == null) || getClass() != object.getClass()) {
            return false;
        }
        final WagonImpl other = (WagonImpl) object;
        return (this.number == other.number);
    }

    @Override
    public boolean isLight() {
        return this.lamp.isOn();
    }

    @Override
    public boolean onLamp() {
        return this.lamp.on();
    }

    @Override
    public boolean offLamp() {
        return this.lamp.off();
    }

    @Override
    public Wagon next() {
        return this.next;
    }

    @Override
    public Wagon prev() {
        return this.prev;
    }

    public void setNext(final WagonImpl next) {
        this.next = next;
        if (!next.prev().equals(this)) {
            next.setPrev(this);
        }
    }

    public void setPrev(final WagonImpl prev) {
        this.prev = prev;
        if (!prev.next().equals(this)) {
            prev.setNext(this);
        }
    }
}
