package Chapter10Recursive;

import java.util.Scanner;

/**
 * Created by papu bhattacharya on 13/9/16.
 */
public class Anagrams {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String for check:");
        String string = scanner.nextLine();
        printAnagrams("", string);
    }

    public static void printAnagrams(String prefix, String word) {
        if (word.length() <= 1) {
            System.out.println(prefix + word);
        } else {
            for (int i = 0; i < word.length(); i++) {
                String current = word.substring(i, i + 1);
                String before = word.substring(0, i);
                String after = word.substring(i + 1);
                printAnagrams(prefix + current, before + after);
            }
        }

    }
}
