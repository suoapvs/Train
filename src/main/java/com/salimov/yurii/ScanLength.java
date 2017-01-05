package com.salimov.yurii;

import java.util.Scanner;

public final class ScanLength {

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
