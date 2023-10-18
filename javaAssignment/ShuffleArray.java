package javaAssignment;

import java.util.*;


public class ShuffleArray {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5, 6, 7};

        // Create a copy of the original array to shuffle
        int[] shuffledArray = Arrays.copyOf(originalArray, originalArray.length);

        // Shuffle the array
        shuffleArray(shuffledArray);

        // Print the shuffled array
        System.out.println("Shuffled Array: " + Arrays.toString(shuffledArray));
    }

    public static void shuffleArray(int[] array) {
        Random random = new Random();
        for (int i = array.length - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);

            // Swap the elements at index i and index
            int temp = array[i];
            array[i] = array[index];
            array[index] = temp;
        }
    }
}
