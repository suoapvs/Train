package com.salimov.yurii.algoritm;

import com.salimov.yurii.train.ITrain;
import com.salimov.yurii.train.Train;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

/**
 * @author Yurii Salimov (yurii.alex.salimov@gmail.com)
 * @version 1.0
 */
public class CalculateLengthTest {

    @Test
    public void whenSetNullInConstructorThenGetLengthZero() {
        final ICalculateLength calculateLength = new CalculateLength(null);
        final int length = calculateLength.getLength();
        assertEquals(length, 0);
    }

    @Test
    public void whenSetTrainInConstructorThenGetTrainLength() {
        final ITrain train1 = new Train(10);
        final ICalculateLength calculateLength = new CalculateLength(train1);
        final int length = calculateLength.getLength();
        assertEquals(length, train1.getLength());
    }

    @Test
    public void whenSetNullInConstructorThenGetTrainNull() {
        final ICalculateLength calculateLength = new CalculateLength(null);
        final ITrain train = calculateLength.getTrain();
        assertNull(train);
    }

    @Test
    public void whenSetTrainInConstructorThenGetTrain() {
        final ITrain train1 = new Train(10);
        final ICalculateLength calculateLength = new CalculateLength(train1);
        final ITrain train2 = calculateLength.getTrain();
        assertNotNull(train2);
        assertEquals(train1, train2);
    }
}
