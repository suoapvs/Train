package com.salimov.yurii;

import com.salimov.yurii.algoritm.WagonsCalculator;
import com.salimov.yurii.train.RandomTrainBuilder;
import com.salimov.yurii.train.Wagon;

public class Main {

    public static void main(String[] args) {
        final RandomTrainBuilder builder = new RandomTrainBuilder();
        final Wagon startWagon = builder.createTrain().getWagon();
        final WagonsCalculator calculator = new WagonsCalculator(startWagon);
        System.out.println("Calculated length = " + calculator.calcLength());
        System.out.println("Real length = " + builder.getLength());
    }
}
