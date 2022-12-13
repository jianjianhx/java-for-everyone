package ch14;

import java.util.Scanner;

/**
 * This program measures how long it takes to sort an
 * array of a user-specific size with the selection
 * sort algorithm.
 */
public class SelectionSortTimer {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = in.nextInt();
        in.close();

        // Construct random array
        int[] a = ArrayUtil.randomIntArray(n, 100);

        // Use stopwatch to time selection sort
        StopWatch timer = new StopWatch();
        timer.start();
        SelectionSorter.sort(a);
        timer.stop();

        System.out.printf("Elapsed time: %d milliseconds\n", timer.getElapsedTime());
    }
}
