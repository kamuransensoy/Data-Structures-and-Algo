
import java.util.HashSet;

public class HashSetPractice {
    
    /** 
     * 217. Contains Duplicate
     * Given an integer array nums, return true if any value appears at least twice in the array,
     * and return false if every element is distinct.
     * 
     * Example 1: Input: nums = [1,2,3,1] Output: true 
     * Explanation: The element 1 occurs at the indices 0 and 3. 
     * Example 2: Input: nums = [1,2,3,4] Output: false
     */
    
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> mySet = new HashSet<>();
        for (int myInt : nums) {
            if (mySet.contains(myInt)) {
                return true;
            }
            mySet.add(myInt);
        }
        return false;
    }
    
    public static void main(String[] args) {
        HashSetPractice obj = new HashSetPractice();
        int[] nums1 = {1, 2, 3, 1};
        int[] nums2 = {1, 2, 3, 4};
        
        System.out.println("Contains Duplicate (nums1): " + obj.containsDuplicate(nums1)); // true
        System.out.println("Contains Duplicate (nums2): " + obj.containsDuplicate(nums2)); // false
    }
}