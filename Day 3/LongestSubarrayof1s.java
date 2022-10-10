/* 
Given a binary array nums, you should delete one element from it. 
Return the size of the longest non-empty subarray containing only 1's in the resulting array. 
Return 0 if there is no such subarray.

Example 1: Input: nums = [1,1,0,1] Output: 3 Explanation: After deleting the number in position 2, [1,1,1] contains 3 numbers with value of 1's.

Example 2: Input: nums = [0,1,1,1,0,1,1,0,1] Output: 5 Explanation: After deleting the number in position 4, [0,1,1,1,1,1,0,1] longest subarray with value of 1's is [1,1,1,1,1].

Example 3: Input: nums = [1,1,1] Output: 2 Explanation: You must delete one element.

Input Format

4 1 1 0 1

Constraints

1 <= nums.length <= 105 nums[i] is either 0 or 1.

Output Format

3
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static int longestSubarray(int[] A) {
    int i = 0, j, k = 1, res = 0;
    for (j = 0; j < A.length; ++j) {
        if (A[j] == 0) {
            k--;
        }
        while (k < 0) {
            //[i,j] has two zero
            if (A[i] == 0) {
                //find the first zero
                k++;
            }
            i++;
        }
        res = Math.max(res, j - i);
    }
    return res;
}
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        int max = longestSubarray(a);
        System.out.println(max);
    }
}