/*
 * Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.

Example 1: Input: nums = [1,2,3,1], k = 3 Output: true

Example 2: Input: nums = [1,0,1,1], k = 1 Output: true

Example 3: Input: nums = [1,2,3,1,2,3], k = 2 Output: false

Input Format

4 3 1 2 3 1

Constraints

1 <= nums.length <= 105 -109 <= nums[i] <= 109 0 <= k <= 105

Output Format

true

Sample Input 0

4
3
1 2 3 1
Sample Output 0

true
Sample Input 1

4
1
1 0 1 1
Sample Output 1

true
 */
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int k = sc.nextInt();
        int flag = 0;
        for(int i =0;i<n;i++){
            a[i] = sc.nextInt();
        }
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                if(a[i] == a[j] && (int)Math.abs(i-j)<k && i!=j){
                    flag = 1;
                    break;
                }
            }
            if(flag == 1){
                break;
            }
        }
        if(flag == 1){
                                System.out.println("true");

        }else{
                                System.out.println("false");

        }
    }
}