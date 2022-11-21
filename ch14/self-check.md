# Chapter 14: Sorting and Searching

## 14.1 Selection Sort

1. Why do we need the `temp` variable in the `swap` method? What would happen if you simply assigned `a[i]` to `a[j]` and `a[j]` to `a[i]`?

   We need to store one of the values temporarily. Otherwise, the values will just duplicate one of them. For example, if we simply assign `a[i]` to `a[j]` and `a[j]` to `a[i]`, then `a[i]` and `a[j]` will both have the original value of `a[i]` so that they are not swapped.

2. What steps does the selection sort algorithm go through to sort the sequence `6 5 4 3 2 1`?

   It will first find the smallest which is `1` and swap it with the first element which is `6`. Then it will find the smallest starting from the second element and swap them and so on.

3. How can you change the selection sort algorithm so that it sorts the elements in descending order (that is, with the largest element at the beginning of the array)?

   Instead of finding the smallest value in each loop, we can find the largest one.

4. Suppose we modified the selection sort algorithm to start at the end of the array, working toward the beginning. In each step, the current position is swapped with the minimum. What is the result of this modification?

   The result will be the elements sorted in descending order.

## 14.2 Profiling the Selection Sort Algorithm

5. Approximately how many seconds would it take to sort a data set of 80,000 values?

   Four times as long as 40,000 values.

6. Look at the graph at Figure. 1. What mathematical shape does it resemble?

   A parabola.

## 14.3 Analyzing the Performance of the Selection Sort Algorithm

7. If you increase the size of a data set tenfold, how much longer does it take to sort it with the selection sort algorithm?

   100 times as long.

8. How large does $n$ need to be so that $\frac{1}{2} n^2$ is bigger than $\frac{5}{2} n - 3$?

   $n$ needs to be greater than 3.

9. Section 6.3.6 has two algorithms for removing an element from an array of length $n$. How many array visits does each algorithm require on average?

   The first requires $1$ visit, and the second requires $n - 2$.

10. Describe the number of array visits in Self Check 9 using the big-Oh notation.

    The first takes $O(1)$ and the second takes $O(n)$.

11. What is the big-Oh running time of checking whether an array is already sorted?

    $O(n)$.

12. Consider this algorithm for sorting an array. Set $k$ to the length of the array. Find the maximum of first $k$ elements. Remove it, using the second algorithm of Section 6.3.6. Decrement $k$ and place the removed element into the $k$th position. Stop if $k$ is 1. What is the algorithm's running time in big-Oh notation?

    $O(n^2)$.

## 14.4 Merge Sort

13. Why does only one of the two `while` loops at the end of the `merge` method do any work?

    Because the previous `while` loop will stop only if either `iFirst >= first.length` or `iSecond >= second.length`.

14. Manually run the merge sort algorithm on the array `8 7 6 5 4 3 2 1`.

    ```
    8 7 6 5 4 3 2 1
    8 7 6 5 | 4 3 2 1
    8 7 | 6 5 | 4 3 | 2 1
    7 8 | 5 6 | 3 4 | 1 2
    5 6 7 8 | 1 2 3 4
    1 2 3 4 5 6 7 8
    ```

15. The merge sort algorithm processes an array by recursively processing two halves. Describe a similar recursive algorithm for computing the sum of all elements in an array.

    Summing all elements by adding the sums of two halves.