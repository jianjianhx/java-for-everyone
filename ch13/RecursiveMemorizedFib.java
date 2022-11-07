package ch13;

import java.util.ArrayList;
import java.util.Scanner;

public class RecursiveMemorizedFib {
    private static final ArrayList<Long> fibList = new ArrayList<>();

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
        while (fibList.size() < 2) { fibList.add(1L); }
        if (fibList.size() >= n) {
            return fibList.get(n - 1);
        } else {
            long f = fib(n - 1) + fib(n - 2);
            fibList.add(f);
            return f;
        }
    }
}
