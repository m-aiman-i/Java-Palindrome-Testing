/*
 *
 * @Author   Muhammad Aiman Iskandar
 * @Version  JDK 18
 * @Since    14-06-2022
 * */
import javax.swing.*;
import java.util.*;

public class PalindromeDemo {

    public static void main(String[] args) { // Main method declaration
        String str;

        str = JOptionPane.showInputDialog("Insert a word");

        if (isPalindrome(str)) {
            System.out.println("Word: " + str + " is a Palindrome");
        } else {
            System.out.println("Word: " + str + " is not a Palindrome");
        }
    } // End of Main method

    public static boolean isPalindrome(String word) {
        char first;
        char last;

        if (word.length() <= 1) {
            return true;
        } else {
            word = word.toLowerCase(Locale.ROOT);
            first = word.charAt(0);
            last = word.charAt(word.length() - 1);
        }
        if (first == last) {
            return isPalindrome(word.substring(1, word.length() - 1));
        } else {
            return false;
        }
    }
} // End of class
