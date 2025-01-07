/**
 * This file is designed to serve as a comprehensive resource for Java learners and developers to practice coding problems. 
 * It includes a variety of coding challenges and their corresponding solutions, 
 * covering key programming concepts, algorithms, and data structures.
 */

public class Practice{

    public static void main(String[] args) {
        
        int[][] arr = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                
            }
        }
    }

public static void FindPivotIndex(int[] nums){

/**
 * Given an array of integers nums, calculate the pivot index of this array.
 * The pivot index is the index where the sum of all the numbers strictly to the left of 
 * the index is equal to the sum of all the numbers strictly to the index's right.If the index is on the left edge of the array, 
 * then the left sum is 0 because there are no elements to the left. This also applies to the right edge of the array.
 * Return the leftmost pivot index. If no such index exists, return -1.
 */

        int[] array = nums;
        int sumRight = 0;
        int sumLeft = 0;
        int total = 0;
        
        for(int i = 0; i < array.length; i++){
            total += array[i];
        }
        
        for(int i=0; i < array.length; i++){
            
            sumRight = total - sumLeft - array[i];
            
            if(sumRight == sumLeft){
                //return i;
            }
            
            sumLeft += array[i];
        }
        
        //return -1;

}

public static void LargestNumberAtLeastTwiceofOthers(int[] nums){
/**
 * You are given an integer array nums where the largest integer is unique. 
 * Determine whether the largest element in the array is at least twice as much as every other number in the array. 
 * If it is, return the index of the largest element, or return -1 otherwise.
 */


        int[] array = nums;
        int largest = Integer.MIN_VALUE;
        int index = 0;
        int length = array.length;
        int secondLargest = 0;
        
        for(int i = 0; i < length; i++){
            
            if(array[i] > largest){
                secondLargest = largest;
                largest = array[i];
                index = i;
            }else if(nums[i] > secondLargest){
                secondLargest = nums[i];
            }
            
        }
        if(secondLargest*2 <= largest){
            //return index;
        }
        
        //return -1;
}

public static void PlusOne(int[] digits){
/**
 * You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. 
 * The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.
 * Increment the large integer by one and return the resulting array of digits.
 */

    int[] array = digits;
        int length = array.length;
        
        for(int i = length -1; i >= 0; i--){
            if(array[i] < 9){
                array[i] += 1;
                //return array;
            }
            
            array[i] = 0;    
        }
        int[] nwArr = new int[length+1];
        nwArr[0] = 1;
            
        //return nwArr;
}


}