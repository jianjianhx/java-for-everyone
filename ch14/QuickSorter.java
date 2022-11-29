package ch14;

public class QuickSorter {
    public static void sort(int[] a) {
        sort(a, 0, a.length - 1);
    }

    public static void sort(int[] a, int from, int to) {
        if (from >= to) { return; }
        int p = partition(a, from, to);
        sort(a, from, p - 1);
        sort(a, p + 1, to);
    }

    private static int partition(int[] a, int from, int to) {
        int pivot = a[from];
        int i = from - 1;
        int j = to + 1;
        while (i < j) {
            i++; while (a[i] < pivot) { i++; }
            j--; while (a[j] > pivot) { j--; }
            if (i < j) {
                ArrayUtil.swap(a, i, j);
            }
        }
        return j;
    }
}
