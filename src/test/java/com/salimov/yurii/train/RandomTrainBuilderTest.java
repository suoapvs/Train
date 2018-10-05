package com.salimov.yurii.train;

import org.junit.Test;

import static org.junit.Assert.*;

public class RandomTrainBuilderTest {

    @Test
    public void whenGetWagonThenReturnNotNull() {
        assertNotNull(new RandomTrainBuilder().getWagon());
    }

    @Test
    public void whenGenerateTrainsThenReturnDifferentLengths() {
        final RandomTrainBuilder builder = new RandomTrainBuilder();
        int prevLength = builder.getLength();
        int currentLength;
        for (int i = 0; i < 10; i++) {
            currentLength = builder.createTrain().getLength();
            assertNotEquals(prevLength, currentLength);
            prevLength = currentLength;
        }
    }
}