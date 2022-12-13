package ch14;

import java.util.Arrays;

/**
 * This program demonstrates the selection sort algorithm by
 * sorting an array that is filled with random numbers.
 */
public class MergeSortDemo {
    public static void main(String[] args) {
        int[] a = ArrayUtil.randomIntArray(20, 100);
        System.out.println(Arrays.toString(a));

        MergeSorter.sort(a);

        System.out.println(Arrays.toString(a));
    }
}
