/**
 * This program merges two sorted arrays into a single sorted list.
 * It uses the two-pointer technique to efficiently compare and merge elements 
 * from both arrays while maintaining the sorted order.
 *
 * Steps:
 * 1. Initialize two pointers (`i` for the first array and `j` for the second array).
 * 2. Compare the current elements of the arrays:
 *      - Add the smaller element to the list and move the respective pointer.
 * 3. When one array is fully processed, add all remaining elements from the other array.
 * 4. Print the merged list.
 *
 * Time Complexity: O(n + m), where n and m are the lengths of the two arrays.
 * Space Complexity: O(n + m), for storing the merged list.
 */

import java.util.ArrayList;

public class MergeSortedArrays {
    public static void main(String[] args) {
        // Two sorted arrays to merge
        int[] arr = {0, 4, 5, 9, 10, 12, 15};
        int[] arr2 = {2, 3, 7, 12, 15, 17, 22, 32};

        // Initialize two pointers for the arrays
        int i = 0; // Pointer for the first array
        int j = 0; // Pointer for the second array

        // Create a list to store the merged result
        ArrayList<Integer> list = new ArrayList<Integer>();

        /**
         * Main merging logic:
         * Compare the current elements of both arrays and add the smaller one to the list.
         * Move the pointer for the array from which the element was taken.
         */
        while (i < arr.length && j < arr2.length) {
            if (arr[i] <= arr2[j]) {
                // If arr[i] is smaller or equal, add it to the list and move pointer i
                list.add(arr[i]);
                i++;
            } else {
                // If arr2[j] is smaller, add it to the list and move pointer j
                list.add(arr2[j]);
                j++;
            }
        }

        /**
         * Handle remaining elements:
         * Add all remaining elements from `arr` or `arr2` (whichever is not fully processed).
         */
        while (i < arr.length) {
            // Add remaining elements from the first array
            list.add(arr[i]);
            i++;
        }

        while (j < arr2.length) {
            // Add remaining elements from the second array
            list.add(arr2[j]);
            j++;
        }

        for (int k = 0; k < list.size(); k++) {
            if (k == list.size() - 1) {
                // Last element without a comma
                System.out.print(list.get(k));
            } else {
                // All other elements with a comma
                System.out.print(list.get(k) + ", ");
            }
        }
    }
}
