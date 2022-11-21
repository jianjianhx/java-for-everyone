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