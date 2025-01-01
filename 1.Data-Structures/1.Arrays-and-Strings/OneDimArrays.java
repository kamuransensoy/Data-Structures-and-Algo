
import java.util.Arrays;
public class OneDimArrays {

/**
 * An array is a basic data structure to store a collection of elements sequentially. 
 * But elements can be accessed randomly since each element in the array can be identified by an array index. 
 * An array can have one or more dimensions. Here we start with the one-dimensional array, which is also called the linear array. 
 * Here is an example: A = {6, 3, 8, 7, 2, 9} 
 * In the above example, there are 6 elements in array A. 
 * That is to say, the length of A is 6. We can use A[0] to represent the first element in the array. 
 * Therefore, A[0] = 6. Similarly, A[1] = 3, A[2] = 8 and so on.
 */

    public static void main(String[] args) {
        // 1. Initialize
        int[] array = {1,2,3,4};
        int[] arr = new int[4];
        // 2. Get Length
        System.out.println("Length of the array is " + array.length);
        // 3. Access Element
        System.out.println("The second element of the array is " + array[1]);
        System.out.println("The last element of the array is " + array[3]);
        // 4. Iterate all Elements
        // 1st Verstion
        for(int i = 0; i < array.length; i++){
            System.out.print(", " + array[i]);
        }
        System.out.println();
        // 2nd Version
        for(int item: array){
            System.out.print(", " + item);
        }
        System.out.println();
        // 5 Modify Element
        array[0] = 7;
        System.out.println(array[0]);
        // 6.Sort
        Arrays.sort(array);
        for(int i = 0; i < array.length; i++){
            System.out.print(" " + array[i]);
        }
    }
}
