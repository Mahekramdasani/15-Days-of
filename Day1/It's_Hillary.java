/*
You are given a 0-indexed integer array nums.
An index i is part of a hill in nums if the closest non-equal neighbors of i are smaller than nums[i]. 
Similarly, an index i is part of a valley in nums if the closest non-equal neighbors of i are larger than nums[i].
Adjacent indices i and j are part of the same hill or valley if nums[i] == nums[j].
Note that for an index to be part of a hill or valley, it must have a non-equal neighbor on both the left and right of the index.
Return the number of hills and valleys in nums.

Input Format

6
2 4 1 1 6 5
Constraints

3 <= nums.length <= 100 1 <= nums[i] <= 100

Output Format

3
Sample Input 0

6
2 4 1 1 6 5
Sample Output 0

3
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
        int c=0,i,j;
        int[] a = new int[n];
        for(i=0;i<n;i++){
            a[i] =sc.nextInt();
        }
        for(i=1;i<n-1;i++){
            if(a[i] == a[i+1]){
                if(a[i]>a[i+2] && a[i]>a[i-1] ){
                    c++;
                }
                if(a[i]<a[i+2] && a[i]<a[i-1]){
                    c++;
                }
            }else{
                if(a[i]>a[i+1] && a[i]>a[i-1] ){
                    c++;
                }
                if(a[i]<a[i+1] && a[i]<a[i-1]){
                    c++;
                }
            }
        }
        System.out.println(c);
    }
}
