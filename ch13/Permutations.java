package ch13;

import java.util.ArrayList;

public class Permutations {
    public static void main(String[] args) {
        for (var permutation : permutations("eat")) {
            System.out.println(permutation);
        }
    }
    public static ArrayList<String> permutations(String word) {
        ArrayList<String> permutationList = new ArrayList<>();

        if (word.length() == 0) {
            permutationList.add(word);
        } else {
            for (int i = 0; i < word.length(); i++) {
                char firstChar = word.charAt(i);
                String restOfWord = word.substring(0, i) + word.substring(i + 1);
                for (var permutation : permutations(restOfWord)) {
                    permutationList.add(firstChar + permutation);
                }
            }
        }
        return permutationList;
    }
}
