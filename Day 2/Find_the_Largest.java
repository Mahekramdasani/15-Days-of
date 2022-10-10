/*
 * Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum. 
 * A subarray is a contiguous part of an array.

Example 1: Input: nums = [-2,1,-3,4,-1,2,1,-5,4] Output: 6 Explanation: [4,-1,2,1] has the largest sum = 6.

Example 2: Input: nums = [1] Output: 1

Example 3: Input: nums = [5,4,-1,7,8] Output: 23

Input Format

4 4 -1 2 1

Constraints

1 <= nums.length <= 105 -104 <= nums[i] <= 104

Output Format

6

Sample Input 0

9
2 1 -3 4 -1 2 1 -5 4
Sample Output 0

6
Sample Input 1

1
1
Sample Output 1

1
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static int maxSubArraySum(int a[])
    {
        int size = a.length;
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
 
        for (int i = 0; i < size; i++) {
            max_ending_here = max_ending_here + a[i];
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        System.out.println(maxSubArraySum(a));
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. 
        9
        2 1 -3 4 -1 2 1 -5 4
        */
    }
}