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