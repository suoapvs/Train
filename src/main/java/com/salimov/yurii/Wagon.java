package com.salimov.yurii;

/**
 * The class describes the wagon entity.
 *
 * @author Yurii Salimov (yurii.alex.salimov@gmail.com)
 * @version 1.0
 * @see IWagon
 * @see ILamp
 */
public final class Wagon implements IWagon {

    /**
     * The wagon number.
     */
    private int number;

    /**
     * The wagon lamp.
     */
    private ILamp lamp;

    /**
     * Constructor.
     *
     * @param number a wagon number.
     * @param lamp   a wagon lamp.
     */
    public Wagon(
            final int number,
            final ILamp lamp
    ) {
        this.number = number;
        this.lamp = lamp;
    }

    /**
     * Constructor.
     *
     * @param number a wagon number.
     */
    public Wagon(final int number) {
        this(number, new Lamp());
    }

    /**
     * Returns a wagon number.
     *
     * @return The wagon number.
     */
    @Override
    public int getNumber() {
        return this.number;
    }

    /**
     * Sets a wagon number.
     *
     * @param number a wagon number.
     */
    @Override
    public void setNumber(final int number) {
        this.number = number;
    }

    /**
     * Returns a wagon lamp state.
     *
     * @return The wagon lamp state.
     */
    @Override
    public boolean getLampState() {
        return this.lamp.getState();
    }

    /**
     * Turns on a wagon lamp.
     *
     * @return The lamp state.
     */
    @Override
    public boolean onLamp() {
        return this.lamp.on();
    }

    /**
     * Turns off a wagon lamp.
     *
     * @return The lamp state.
     */
    @Override
    public boolean offLamp() {
        return this.lamp.off();
    }

    /**
     * Toggle a wagon lamp state.
     *
     * @return The lamp state.
     */
    @Override
    public boolean turnLamp() {
        return getLampState() ? offLamp() : onLamp();
    }
}
