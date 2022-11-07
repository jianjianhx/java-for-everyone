package ch13;

import java.util.Scanner;

public class RecursiveFibTracer {
    public static void main(String[] args) {
        int n;
        try (Scanner inScanner = new Scanner(System.in)) {
            System.out.print("Enter n: ");
            n = inScanner.nextInt();
        }

        long f = fib(n);
        System.out.printf("fib(%d) = %d", n, f);
    }

    public static long fib(int n) {
        System.out.printf("Entering fib: n = %d\n", n);
        long f;
        if (n <= 2) { f = 1; }
        else { f = fib(n - 1) + fib(n - 2); }
        System.out.printf("Exiting fib: n = %d, return value = %d\n", n, f);
        return f;
    }
}
