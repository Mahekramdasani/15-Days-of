/*
 * Given an integer array nums, return true if there exists a triple of indices (i, j, k) 
 * such that i < j < k and nums[i] < nums[j] < nums[k]. 
 * If no such indices exists, return false.

Input Format

length = 5
arr = [1, 2, 3, 4, 5]
Constraints

1 <= nums.length <= 5 * 105
-231 <= nums[i] <= 231 - 1
Output Format

true

Sample Input 0

5
5 4 3 2 1
Sample Output 0

false
Explanation 0

Any triplet where i < j < k is valid.

Sample Input 1

6
2 1 5 0 4 6
Sample Output 1

true
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int i,j,k,flag = 0;
        for(i = 0;i<n;i++){
            a[i] = sc.nextInt();
        }
        for(i=0;i<n;i++){
            for(j = i+1;j<n;j++){
                for(k = j+1;k<n;k++){
                    if(a[i]<a[j] && a[j]<a[k] && flag ==0){
                        flag = 1;
                        break;
                    }
                }
            }
        }
        if(flag == 1){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
        
    }
}