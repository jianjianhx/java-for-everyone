package ch13;

public class Palindrome {
    /**
     * Tests whether a text is a palindrome.
     * @param text a string
     * @return true if a string is palindrome else false
     */
    public static boolean isPalindrome(String text) {
        text = preprocess(text);

        if (text.length() <= 1) { return true; }
        else {
            return text.charAt(0) == text.charAt(text.length() - 1)
                    && isPalindrome(text.substring(1, text.length() - 1));
        }
    }

    /**
     * Preprocess a string before sending it into <code>isPalindrome</code>.
     * Specifically, remove all the punctuations and spaces from the string, then make the letters all uppercase.
     * @param text a string
     * @return a string without punctuations and spaces, and with all uppercase letters
     */
    private static String preprocess(String text) {
        return text.replaceAll("[^A-Za-z]+", "").toUpperCase();
    }
}
