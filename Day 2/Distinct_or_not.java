/*
 * Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
 *  Example 1: Input: nums = [1,2,3,1] Output: true

Example 2: Input: nums = [1,2,3,4] Output: false

Example 3: Input: nums = [1,1,1,3,3,4,3,2,4,2] Output: true

Note : the output string must be in the same case as given in the format

Input Format

4 1 2 3 1

Constraints

1 <= nums.length <= 105 -109 <= nums[i] <= 109

Output Format

true

Sample Input 0

4
1 2 3 1
Sample Output 0

true
Sample Input 1

4
1 2 3 4 
Sample Output 1

false
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
        int flag = 0;
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j= i+1;j<n;j++){
                if(a[i] == a[j]){
                    flag =1;
                    break;
                }
            }
        }
        if(flag == 0){
            System.out.println("false");
        }else{
            System.out.println("true");
        }
    }
}
