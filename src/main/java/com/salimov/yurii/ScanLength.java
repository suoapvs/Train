package com.salimov.yurii;

import java.util.Scanner;

/**
 * The class describes a method for scanning
 * the length of a train with a console.
 * The value is entered by the user.
 *
 * @author Yurii Salimov (yurii.alex.salimov@gmail.com)
 * @version 1.0
 */
public final class ScanLength {

    /**
     * Scans the length of a train with a console.
     * The user enters a value as long as the length
     * is greater than zero.
     *
     * @return The train length (number of wagons).
     */
    public static int scan() {
        int length;
        try (final Scanner scanner = new Scanner(System.in)) {
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
        }
        return length;
    }
}
