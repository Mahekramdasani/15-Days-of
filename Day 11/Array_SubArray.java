/*
 * Given an integer array nums, find a contiguous non-empty subarray within the array that has the largest product, and return the product. The test cases are generated so that the answer will fit in a 32-bit integer. A subarray is a contiguous subsequence of the array.

Example 1: Input: size of array = 4 nums = [2,3,-2,4] Output: 6 Explanation: [2,3] has the largest product 6.

Example 2: Input:size of array = 3 nums = [-2,0,-1] Output: 0 Explanation: The result cannot be 2, because [-2,-1] is not a subarray.

Input Format

4 2 3 -2 4

Constraints

1 <= nums.length <= 2 * 104 -10 <= nums[i] <= 10 The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

Output Format

6

Sample Input 0

4
2 3 -2 4
Sample Output 0

6
Sample Input 1

3
-2 0 -1
Sample Output 1

0
Sample Input 2

9
-2 1 -3 4 -1 2 1 -5 4
Sample Output 2

960
 */
import java.io.*;
import java.util.*;

public class Solution {
 static int maxProduct(int arr[], int n, int k)
    {
        // Initialize result
        int max_sum = Integer.MIN_VALUE;
  
        // Consider all blocks starting with i.
        for (int i = 0; i < n - k + 1; i++) {
            int current_sum = 1;
            for (int j = 0; j < k; j++)
                current_sum = current_sum * arr[i + j];
  
            // Update result if required.
            max_sum = Math.max(current_sum, max_sum);
        }
  
        return max_sum;
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int max = Integer.MIN_VALUE;

        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0;i<n;i++){
            a[i] = sc.nextInt();
        }
        for(int i = 1;i<=n;i++){
            int curr;
            curr = maxProduct(a,n,i);
            max = Math.max(max,curr);
        }
        System.out.println(max);
    }
}