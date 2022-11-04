# Chapter 13: Recursion

## 13.1 Triangle Numbers Revisited

1. Why is the statement else `if (width == 1) { return 1; }` in the final version of the `getArea` method unnecessary?

   Because it already has `if (width <= 0) { return 0; }`.
2. How would you modify the program to recursively compute the area of a square?

   You would compute the smaller area recursively, then return `smallerArea + width + width -1`
3. In some cultures, numbers containing the digit 8 are lucky numbers. What is wrong with the following method that tries to test whether a number is lucky?
   ```java
   public static boolean isLucky(int number) {
       int lastDigit = number % 10;
       if (lastDigit == 8) { return true; }
       else {
           return isLucky(number / 8);
       }    
   }
   ```

   You should add terminate condition `if (number == 0) { return false; }`.
4. In order to compute a power of two, you can take the next-lower power and double it. For example, if you want to compute $2^11$, and you know that $2^10 = 1024$, then $2^11 = 2 \times 1024 = 2048$. Write a recursive method `public static int pow2(int n)` that is based on this observation.

   ```java
   public static int pow2(int n) {
       if (n == 0) { return 1; }
       
       return 2 * pow2(n - 1);
   }
   ```
5. Consider the following recursive method:
   ```java
   public static int mystery(int n) {
       if (n <= 0) { return 0; }
       else {
           int smaller = n - 1;
           return mystery(smaller) + n * n;
       }
   }
   ```
   What is mystery(4)?

   `mystery(4)` is 1x1 + 2x2 + 3x3 + 4x4 = 30.

## 13.2 Problem Solving: Thinking Recursively

6. Consider the task of removing all punctuation marks from a string. How can we break the string into smaller strings that can be processed recursively?

   In this problem, any decomposition will work. We can remove the first or last character and then remove punctuation marks from the remainder. Or we can break the string in two substrings, and remove punctuation marks from each.
7. In a recursive method that removes all punctuation marks from a string, we decide to remove the last character, then recursively process the remainder. How do you combine the results?

   If the last character is a punctuation mark, then you simply return the shorter string with punctuation marks removed. Otherwise, reattach the last character to that result and return it.
8.  How do you find solutions for the simplest inputs when removing punctuation marks from a string?

   The simplest input is the empty string. It contains no punctuation marks, so you simply return it.
9. Provide pseudocode for a recursive method that removes punctuation marks from a string, using the answers to Self Checks 6–8.

   ```java
   String removePunctuation(String str) {
       if (str.length() == 0) { return str; }
       else {
           char last = str.charAt(str.length() - 1);
           char last = Character.isLetter(last) ? last : '';
           return removePunctuation(str.substring(0, str.length() - 1)) + last;
       }
   }
   ```

## 13.3 Recursive Helper Method

10. Do we have to give the same name to both `isPalindrome` methods?

   No.
11. When does the recursive `isPalindrome` method stop calling itself?

   When `start` is greater than or equal to `end`.
12. To compute the sum of the values in an array, add the first value to the sum of the remaining values, computing recursively. Of course, it would be inefficient to set up and actual array of the remaining values. Which recursive helper method can solve the problem?

   `int sum(int[] arr, int start, int end)`
13. How can you write a recursive method `public static void sum(int[] a)` without needing a helper function?

   Create new smaller arrays every time before calling the function recursively.