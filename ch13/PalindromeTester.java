package ch13;

public class PalindromeTester {
    public static void main(String[] args) {
        String text;

        text = "A man, a plan, a canal--Panama!";
        System.out.printf("\"%s\" is a palindrome: %b\n", text, Palindrome.isPalindrome(text));

        text = "Go hang a salami, I'm a lasagna hog";
        System.out.printf("\"%s\" is a palindrome: %b\n", text, Palindrome.isPalindrome(text));

        text = "Madam, I'm Adam";
        System.out.printf("\"%s\" is a palindrome: %b\n", text, Palindrome.isPalindrome(text));

        text = "Madam, I'm not Adam";
        System.out.printf("\"%s\" is a palindrome: %b\n", text, Palindrome.isPalindrome(text));
    }
}
