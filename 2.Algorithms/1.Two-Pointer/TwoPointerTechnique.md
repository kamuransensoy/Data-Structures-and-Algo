Two Pointer Technique

The two-pointer technique is an essential part of a programmer’s toolkit, especially in technical interviews. The name accurately describes the concept—it involves using two pointers (array indices) to save time and space while solving problems.

Just like Binary Search optimizes the number of trials needed to achieve a result, this approach achieves similar benefits by efficiently iterating through arrays or other data structures.

The key idea is to iterate through two different parts of the array simultaneously to find the solution faster.

How It Works
There are primarily two ways to implement the two-pointer technique:

1. One Pointer at Each End
One pointer starts from the beginning, and the other starts from the end.
Both pointers proceed toward each other.
Example: Find if a Pair Exists with a Given Sum S in a Sorted Array
Brute Force Approach:
We use nested loops to find all possible pairs of elements and check their sum.

bool pairExists(int arr[], int n, int S) {
    for (int i = 0; i < n - 1; i++) {
        for (int j = i + 1; j < n; j++) {
            if (arr[i] + arr[j] == S) {
                return true;
            }
        }
    }
    return false;
}
Time Complexity: O(n²)
Efficient Approach:
Using two pointers, we can find the pair in linear time.

bool pairExists(int arr[], int n, int S) {
    int i = 0;
    int j = n - 1;

    while (i < j) {
        int curr_sum = arr[i] + arr[j];

        if (curr_sum == S) {
            return true;
        } else if (curr_sum < S) {
            i++;
        } else { // curr_sum > S
            j--;
        }
    }
    return false;
}
Time Complexity: O(n)

2. Different Paces
Both pointers start from the same position but move at different speeds.
One pointer (e.g., slow) moves step by step, while the other (e.g., fast) moves faster.
Example: Find the Middle of a Linked List
Brute Force Approach:
First, find the length of the linked list and then traverse half its length.

ListNode getMiddle(ListNode head) {
    int len = 0;
    ListNode curr = head;

    // Find the length of the linked list
    while (curr != NULL) {
        curr = curr.next;
        len++;
    }

    // Iterate to the middle of the list
    curr = head;
    for (int i = 0; i < len / 2; i++) {
        curr = curr.next;
    }

    return curr;
}
Time Complexity: O(n)
Space Complexity: O(1)
Efficient Approach:
Using two pointers moving at different speeds allows us to find the middle in one pass.

ListNode getMiddle(ListNode head) {
    ListNode slow = head;
    ListNode fast = head;

    // Move fast by two steps and slow by one step
    while (fast != NULL && fast.next != NULL) {
        slow = slow.next;
        fast = fast.next.next;
    }

    return slow;
}
Time Complexity: O(n)
Space Complexity: O(1)
How Does the Two-Pointer Technique Save Space?
In many cases, a naive implementation requires additional space, increasing the solution's space complexity. The two-pointer technique often eliminates the need for extra space.

Example: Reverse an Array
Naive Approach:
Use a temporary array to reverse the elements.

int[] reverseArray(int arr[], int n) {
    int reverse[n];

    for (int i = 0; i < n; i++) {
        reverse[n - i - 1] = arr[i];
    }

    return reverse;
}
Space Complexity: O(n)
Efficient Approach:
Use two pointers to swap elements from the beginning and end of the array.

int[] reverseArray(int arr[], int n) {
    int i = 0, j = n - 1;

    while (i < j) {
        swap(arr[i], arr[j]);
        i++;
        j--;
    }

    return arr;
}
Space Complexity: O(1)

Advantages of the Two-Pointer Technique:
Time Efficiency: Reduces time complexity compared to brute force approaches.
Space Efficiency: Avoids unnecessary use of extra space in many cases.
Versatility: Can be applied to arrays, linked lists, and strings, among other data structures.
Applications
Finding pairs with specific conditions (e.g., sum, difference).
Reversing arrays or strings.
Detecting cycles in linked lists (slow and fast pointers).
Finding the middle of linked lists.
Solving subarray problems (e.g., sliding window with two pointers).

Conclusion
The two-pointer technique is a simple yet powerful tool for solving many problems efficiently. By understanding its applications and mastering its use, you can significantly optimize your solutions for various algorithmic challenges.

