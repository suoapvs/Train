package com.salimov.yurii.train;

import com.salimov.yurii.train.Lamp;
import com.salimov.yurii.train.Wagon;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * @author Yurii Salimov (yurii.alex.salimov@gmail.com)
 * @version 1.0
 */
public class WagonTest {

    @Test
    public void whenCreateWagonByConstructorWithOneParameterThenAddNewLamp() {
        final Wagon wagon = new Wagon(10);
        assertEquals(wagon.getNumber(), 10);
        assertFalse(wagon.getLampState());
    }

    @Test
    public void whenCreateWagonByConstructorWithTwoParameter() {
        final Lamp lamp = new Lamp(true);
        final Wagon wagon = new Wagon(10, lamp);
        assertEquals(wagon.getNumber(), 10);
        assertTrue(wagon.getLampState());
        assertEquals(lamp.getState(), wagon.getLampState());
    }

    @Test
    public void whenCreateWagonNegativeNumberThenSetZero() {
        final Wagon wagon = new Wagon(-10);
        assertEquals(wagon.getNumber(), 0);
    }

    @Test
    public void whenSetNegativeNumberThenGetZero() {
        final Wagon wagon = new Wagon(10);
        wagon.setNumber(-10);
        assertEquals(wagon.getNumber(), 0);
    }

    @Test
    public void whenSetPositiveNumberThenGetIt() {
        final Wagon wagon = new Wagon(10);
        wagon.setNumber(20);
        assertEquals(wagon.getNumber(), 20);
    }

    @Test
    public void whenTurnOnLampThenSetTrueStateAndReturnIt() {
        final Lamp lamp = new Lamp();
        final Wagon wagon = new Wagon(10, lamp);
        wagon.onLamp();
        assertTrue(wagon.getLampState());
        assertEquals(wagon.getLampState(), lamp.getState());
    }

    @Test
    public void whenTurnOffLampThenSetFalseStateAndReturnIt() {
        final Lamp lamp = new Lamp();
        final Wagon wagon = new Wagon(10, lamp);
        wagon.offLamp();
        assertFalse(wagon.getLampState());
        assertEquals(wagon.getLampState(), lamp.getState());
    }

    @Test
    public void whenTurnLampThenSetReversStateAndReturnIt() {
        final Lamp lamp = new Lamp();
        final Wagon wagon = new Wagon(10, lamp);
        wagon.onLamp();
        assertTrue(wagon.getLampState());
        wagon.turnLamp();
        assertFalse(wagon.getLampState());
        wagon.turnLamp();
        assertTrue(wagon.getLampState());
    }
}
