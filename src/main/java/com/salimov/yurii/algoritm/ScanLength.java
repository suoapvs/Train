package com.salimov.yurii.algoritm;

import java.io.InputStream;
import java.util.Scanner;

/**
 * The class describes a method for scanning
 * the length of a train with a input stream.
 * The value is entered by the user.
 *
 * @author Yurii Salimov (yurii.alex.salimov@gmail.com)
 * @version 1.0
 */
public final class ScanLength implements IScanLength {

    /**
     * The input stream to be scanned
     */
    private final InputStream stream;

    /**
     * Constructor.
     *
     * @param stream An input stream to be scanned.
     */
    public ScanLength(final InputStream stream) {
        this.stream = stream;
    }

    /**
     * Scans the length of a train with a input stream.
     * The user enters a value as long as the length
     * is greater than zero.
     *
     * @return The train length (number of wagons).
     */
    public int scan() {
        int length;
        try (final Scanner scanner = new Scanner(this.stream)) {
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
        } catch (NullPointerException ex) {
            ex.printStackTrace();
            length = 0;
        }
        return length;
    }
}
