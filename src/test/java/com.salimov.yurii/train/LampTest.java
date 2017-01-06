package com.salimov.yurii.train;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * @author Yurii Salimov (yurii.alex.salimov@gmail.com)
 * @version 1.0
 */
public class LampTest {

    @Test
    public void whenCreateLampByDefaultConstructorThenSetFalseState() {
        final ILamp lamp = new Lamp();
        assertFalse(lamp.getState());
    }

    @Test
    public void whenCreteLampByConstructorWithInputStateThenSetItState() {
        final ILamp lamp1 = new Lamp(true);
        assertTrue(lamp1.getState());
        final ILamp lamp2 = new Lamp(false);
        assertFalse(lamp2.getState());
    }

    @Test
    public void whenTurnOnLampThenSetTrueStateAndReturnIt() {
        final ILamp lamp = new Lamp();
        lamp.on();
        assertTrue(lamp.getState());
    }

    @Test
    public void whenTurnOffLampThenSetFalseStateAndReturnIt() {
        final ILamp lamp = new Lamp();
        lamp.off();
        assertFalse(lamp.getState());
    }
}
