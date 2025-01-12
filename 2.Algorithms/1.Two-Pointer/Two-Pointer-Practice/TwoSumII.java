/**
 * Solution class to solve the "Two Sum II - Input Array Is Sorted" problem.
 * This class provides a method to find two numbers in a sorted array such that their sum equals a target value.
 */
public class TwoSumII {

    /**
     * Finds the indices of two numbers in a sorted array that add up to the given target.
     *
     */
    public int[] twoSum(int[] numbers, int target) {
        
        // Initialize two pointers
        int i = 0; // Pointer starting at the beginning of the array
        int j = numbers.length - 1; // Pointer starting at the end of the array
        
        // Iterate until the two pointers meet
        while (i < j) {
            int sum = numbers[i] + numbers[j]; // Calculate the sum of the elements at the two pointers
            
            if (sum == target) {
                // If the sum equals the target, return the 1-based indices
                return new int[]{i + 1, j + 1};
            } 
            
            if (sum < target) {
                // If the sum is less than the target, move the left pointer to the right
                i++;
            } else {
                // If the sum is greater than the target, move the right pointer to the left
                j--;
            }
        }
        
        // This line will never be reached because the problem guarantees a solution exists
        return new int[]{-1, -1}; 
    }
}
