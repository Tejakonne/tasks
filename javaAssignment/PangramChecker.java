package javaAssignment;

import java.util.*;


public class PangramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();
        scanner.close();

        if (isPangram(input)) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

    public static boolean isPangram(String input) {
        // Convert the input to lowercase to make it case-insensitive
        input = input.toLowerCase();

        // Create a set to store unique letters found in the input
        Set<Character> letterSet = new HashSet<>();

        // Iterate through each character in the input
        for (char c : input.toCharArray()) {
            // Check if the character is an alphabet letter (a to z)
            if (c >= 'a' && c <= 'z') {
                letterSet.add(c);
            }
        }

        // Check if the size of the set is 26 (contains all 26 letters from a to z)
        return letterSet.size() == 26;
    }
}

