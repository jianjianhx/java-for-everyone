package ch13;

import java.util.Scanner;

public class LoopFib {
    public static void main(String[] args) {
        int n;
        try (Scanner inScanner = new Scanner(System.in)) {
            System.out.print("Enter n: ");
            n = inScanner.nextInt();
        }

        for (int i = 1; i <= n; i++) {
            long f = fib(i);
            System.out.printf("fib(%d) = %d\n", i, f);
        }
    }

    public static long fib(int n) {
        if (n <= 2) { return 1; }
        else {
            long fib = 1;
            long lastFib = 1;
            for (int i = 3; i <= n; i++) {
                long temp = fib;
                fib += lastFib;
                lastFib = temp;
            }
            return fib;
        }
    }
}
