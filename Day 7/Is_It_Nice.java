/*
 * You are given an array nums consisting of positive integers. We call a subarray of nums nice if the bitwise AND of every pair of elements that are in different positions in the subarray is equal to 0. Return the length of the longest nice subarray. A subarray is a contiguous part of an array. Note that subarrays of length 1 are always considered nice.

Example 1: Input: nums = [1,3,8,48,10] Output: 3 Explanation: The longest nice subarray is [3,8,48]. This subarray satisfies the conditions: - 3 AND 8 = 0. - 3 AND 48 = 0. - 8 AND 48 = 0. It can be proven that no longer nice subarray can be obtained, so we return 3. Example 2: Input: nums = [3,1,5,11,13] Output: 1 Explanation: The length of the longest nice subarray is 1. Any subarray of length 1 can be chosen.

Input Format

5 1 3 8 48 10

Constraints

1 <= nums.length <= 105 1 <= nums[i] <= 109

Output Format

3

Sample Input 0

5
1 3 8 48 10
Sample Output 0

3
Sample Input 1

5
3 1 5 11 13
Sample Output 1

1
 */
import java.io.*;
import java.util.*;

public class Solution {
    public static int bitwiseAND(int nums[],int n){
        int ans = 1,i,j,mask,new_mask;
        for(i=0;i<n;i++){
            mask = nums[i];
            for(j=i+1;j<n;j++){
                new_mask = mask & nums[j];
                if(new_mask>0){
                    ans = Math.max(ans,j-i);
                    break;
                }
                mask = mask | nums[j];
            }
            if(j == n){
                ans = Math.max(ans,j-i);
                break;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0;i < n;i++){
            a[i] = sc.nextInt();
        } 
        //  for(int i = 0;i < n-1;i++){
        //   for(int j = 0;j < 2;j++){
        //       k[i] = k[i] & a[i+j];
        //       flag = 1;
        //   }
        //   if(k == 0 && flag!=0){
        //       c++;
        //   }   
        // } 
        System.out.println(bitwiseAND(a,n));
    }
}