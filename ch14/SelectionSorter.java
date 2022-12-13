package ch14;

/**
 * The sort method of this class sorts an array, using the selection
 * sort algorithm.
 */
public class SelectionSorter {
    /**
     * Sorts an array, using selection sort.
     * @param a the array to sort
     */
    public static void sort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int minPos = minimumPosition(a, i);
            ArrayUtil.swap(a, minPos, i);
        }
    }

    /**
     * Finds the smallest element in a tail range of the array.
     * @param a the array to sort
     * @param from the first position in the array to compare
     * @return the position of the smallest element
     */
    private static int minimumPosition(int[] a, int from) {
        int minPos = from;
        for (int i = from + 1; i < a.length; i++) {
            if (a[i] < a[minPos]) { minPos = i; }
        }
        return minPos;
    }
}
