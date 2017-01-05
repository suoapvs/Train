package com.salimov.yurii;

/**
 * The main class of the app.
 *
 * @author Yurii Salimov (yurii.alex.salimov@gmail.com)
 * @version 1.0
 * @see Train
 */
public final class Main {

    /**
     * The main method.
     *
     * @param args a input arguments.
     */
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

    /**
     * Prints a result of the application work in the console.
     *
     * @param realLength       a real train length.
     * @param calculatedLength a calculated train length.
     */
    private static void printResult(
            final int realLength,
            final int calculatedLength
    ) {
        System.out.println("Result:");
        System.out.println("Real length = " + realLength);
        System.out.println("Calculated length = " + calculatedLength);
    }
}
