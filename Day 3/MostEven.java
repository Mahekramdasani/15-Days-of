/*
 * Given an integer array nums, return the most frequent even element. 
 * If there is a tie, return the smallest one. 
 * If there is no such element, return -1.

Example 1: Input: nums = [0,1,2,2,4,4,1] Output: 2 Explanation: The even elements are 0, 2, and 4. Of these, 2 and 4 appear the most. We return the smallest one, which is 2. Example 2: Input: nums = [4,4,4,9,2,4] Output: 4 Explanation: 4 is the even element that appears the most.

Example 3: Input: nums = [29,47,21,41,13,37,25,7] Output: -1 Explanation: There is no even element.

Input Format

7 0 1 2 2 4 4 1

Constraints

1 <= nums.length <= 2000 0 <= nums[i] <= 105

Output Format

2
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static int check(ArrayList<Integer> a){
        int[] arr = new int[2000];
        int ans = 1;
        for(int i : a){
            if(i%2 == 0){
                arr[i]++;
                if((arr[ans] < arr[i]) || (arr[ans] == arr[i] && ans>i)){
                    ans = i;
                }
            }
        }
        int k = ans == 1? -1:ans;
        return k;
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        ArrayList<Integer> a = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()){
            int i = sc.nextInt();
            a.add(i);
        }
        int ans = check(a);
        System.out.println(ans);
    }
}