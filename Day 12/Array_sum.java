/*
 * Given an integer array nums and an integer k, return true if nums has a continuous subarray of size at least two whose elements sum up to a multiple of k, or false otherwise. An integer x is a multiple of k if there exists an integer n such that x = n * k. 0 is always a multiple of k.

Example 1: Input: nums = [23,2,4,6,7], k = 6 Output: true Explanation: [2, 4] is a continuous subarray of size 2 whose elements sum up to 6.

Example 2: Input: nums = [23,2,6,4,7], k = 6 Output: true Explanation: [23, 2, 6, 4, 7] is an continuous subarray of size 5 whose elements sum up to 42. 42 is a multiple of 6 because 42 = 7 * 6 and 7 is an integer.

Example 3: Input: nums = [23,2,6,4,7], k = 13 Output: false

Input Format

5 23 2 4 6 7 6

Constraints

1 <= nums.length <= 105 0 <= nums[i] <= 109 0 <= sum(nums[i]) <= 231 - 1 1 <= k <= 231 - 1

Output Format

true

Sample Input 0

5
23 2 4 6 7
6
Sample Output 0

true
Sample Input 1

5
23 2 6 4 7
6
Sample Output 1

true
 */
import java.io.*;
import java.util.*;

public class Solution {
    public static boolean func(int[] arr,int n,int k,int p){
        // boolean b = false;
         for (int i = 0; i < n - k + 1; i++) {
            int current_sum = 0;
            for (int j = 0; j < k; j++)
                current_sum = current_sum + arr[i + j];
  
            // Update result if required.
            if(current_sum%p==0){
                return true;
            }
        }
  return false;
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int flag=0;
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        int k = sc.nextInt();

        for(int i =2;i<n;i++){
            boolean b = func(a,n,i,k);
            if(b == true){
                flag =1;
                break;
            }
        }
        if(flag == 1){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}