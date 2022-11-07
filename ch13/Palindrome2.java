package ch13;

public class Palindrome2 {
    public static boolean isPalindrome(String text) {
        return isPalindrome(text, 0, text.length() - 1);
    }

    private static boolean isPalindrome(String text, int start, int end) {
        if (start >= end) { return true; }
        else {
            char first = Character.toLowerCase(text.charAt(start));
            char last = Character.toLowerCase(text.charAt(end));

            if (Character.isLetter(first) && Character.isLetter(last)) {
                return first == last && isPalindrome(text, start + 1, end - 1);
            } else if (!Character.isLetter(last)) {
                return isPalindrome(text, start, end - 1);
            } else {
                return isPalindrome(text, start + 1, end);
            }
        }
    }
}
