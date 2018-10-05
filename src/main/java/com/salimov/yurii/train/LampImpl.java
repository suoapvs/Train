package com.salimov.yurii.train;

final class LampImpl implements Lamp {

    /**
     * The lamp state.
     * true - on,
     * false - off.
     */
    private boolean state;

    /**
     * state - initial state of the lamp.
     */
    LampImpl(final boolean state) {
        this.state = state;
    }

    @Override
    public boolean isOn() {
        return this.state;
    }

    @Override
    public boolean on() {
        return (this.state = true);
    }

    @Override
    public boolean off() {
        return (this.state = false);
    }
}
