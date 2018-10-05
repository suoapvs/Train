package com.salimov.yurii.algoritm;

import com.salimov.yurii.train.RandomTrainBuilder;
import org.junit.Test;

import static org.junit.Assert.*;

public class WagonsCalculatorTest {

    @Test
    public void checkCorrectCalcLength() {
        final RandomTrainBuilder builder = new RandomTrainBuilder();
        for (int i = 0; i < 10; i++) {
            final WagonsCalculator calculator = new WagonsCalculator(builder.createTrain().getWagon());
            assertEquals(builder.getLength(), calculator.calcLength());
        }
    }
}