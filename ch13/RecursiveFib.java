package ch13;

import java.util.Scanner;

public class RecursiveFib {
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
            return fib(n - 1) + fib(n - 2);
        }
    }
}
