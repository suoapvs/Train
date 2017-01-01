package com.salimov.yurii;

import java.util.Random;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        System.out.println("--- Train Length ---");
        final Train train = new Train(inputLength());
        final TrainLength trainLength = new TrainLength(
                train,
                train.getLength() > 0 ?
                        new Random().nextInt(
                                train.getLength()
                        ) : 0
        );
        System.out.println("Result:");
        System.out.println("Calculated length = " + trainLength.getLength());
        System.out.println("Real length = " + train.getLength());
    }

    private static int inputLength() {
        final Scanner scanner = new Scanner(System.in);
        int length;
        while (true) {
            System.out.print("Input train length = ");
            length = scanner.nextInt();
            if (length > 0) {
                break;
            } else {
                System.out.println(
                        "Incorrect input value! " +
                        "Value must be greater than zero. " +
                        "Try again..."
                );
            }
        }
        return length;
    }
}

