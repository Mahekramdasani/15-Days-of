/*
Given an array nums of size n, return the majority element.
The majority element is the element that appears more than ⌊n / 2⌋ times. 
You may assume that the majority element always exists in the array. 
Input Format
length = 3
arr = [3, 2,3]
Constraints

n == nums.length
1 <= n <= 5 * 104
-109 <= nums[i] <= 109
Output Format

3
Sample Input 0

3
3 2 3
Sample Output 0

3
Sample Input 1

7
2 2 1 1 1 2 2
Sample Output 1

2
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
        int i,j,k=0;
        for(i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        int c = 0;
        for(i=0;i<n;i++){
            for(j=i;j<n;j++){
                if(a[i] == a[j]){
                    c++;
                }
            }
            if(c>n/2){
                c=0;
                k = a[i];
            }
        }
        System.out.println(k);
    }
}
