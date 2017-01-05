package com.salimov.yurii;

public final class Main {

    public static void main(String[] args) {
        System.out.println("--- Train Length ---");
        final Train train = new Train(
                ScanLength.scan()
        );
        final CalculateLength calculateLength = new CalculateLength(train);
        printResult(
                train.getLength(),
                calculateLength.get()
        );
    }

    private static void printResult(
            final int realLength,
            final int calculatedLength
    ) {
        System.out.println("Result:");
        System.out.println("Real length = " + realLength);
        System.out.println("Calculated length = " + calculatedLength);
    }
}
