/**
 * This class provides a method to reverse a given character array in place.
 *
 * <p>The reverseString method takes a character array as input and reverses
 * its elements by swapping characters from the beginning and end of the array
 * while moving toward the middle.
 *
 * <p>Algorithm:
 * - Two pointers (`i` and `j`) are used to traverse the array:
 *      - `i` starts from the beginning of the array.
 *      - `j` starts from the end of the array.
 * - Characters at `i` and `j` are swapped, then the pointers move closer to
 *   the center of the array (`i` increments and `j` decrements).
 * - The process continues until the pointers meet or cross.
 *
 * Time Complexity: O(n), where n is the length of the array.
 * Space Complexity: O(1), as the reversal is performed in place.
 *
 * Example:
 * Input:  ['h', 'e', 'l', 'l', 'o']
 * Output: ['o', 'l', 'l', 'e', 'h']
 */
public class TPreverseString {

    /**
     * Reverses a character array in place.
     *
     * @param s the character array to be reversed
     */
    public void reverseString(char[] s) {
        // Reference to the input array (not necessary, but shows intent)
        char[] arr = s;

        // Two pointers: one starting at the beginning, the other at the end
        int i = 0; // Pointer for the beginning of the array
        int j = arr.length - 1; // Pointer for the end of the array

        // Temporary variable for swapping
        char temp = '\0';

        // Loop until the pointers meet or cross
        while (i < j) {
            // Swap characters at positions i and j
            temp = arr[i];    // Store the character at position i
            arr[i] = arr[j];  // Move the character at position j to position i
            arr[j] = temp;    // Assign the stored character to position j

            // Move the pointers closer to the middle
            i++; // Increment the start pointer
            j--; // Decrement the end pointer
        }
    }
}
