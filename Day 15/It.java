/*
 * Given an array, rotate the array to the right by k steps, where k is non-negative.

Input Format

len = 7
nums = [1,2,3,4,5,6,7], 
k = 3
Constraints

1 <= nums.length <= 105
-231 <= nums[i] <= 231 - 1
0 <= k <= 105
Output Format

[5,6,7,1,2,3,4]
Sample Input 0

7
3
1 2 3 4 5 6 7
Sample Output 0

5 6 7 1 2 3 4
Explanation 0

rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]
Sample Input 1

4
2
-1 -100 3 99
Sample Output 1

3 99 -1 -100
Explanation 1

rotate 1 steps to the right: [99,-1,-100,3]
rotate 2 steps to the right: [3,99,-1,-100]
 */
import java.io.*;
import java.util.*;

public class Solution {
  public void rotate(int[] nums, int k) {
        k = k % nums.length; // for length of array is less to k
        if(k < 0){ // for -ve value
            k += nums.length;
        }
        
         //complete rotate array
        rev(nums, 0, nums.length - 1);

        //K part reversal
        rev(nums, 0, k-1);

        //Non K part reversal
        rev(nums, k, nums.length -1);
    }

    private void rev(int[] arr, int i, int j){
        while (i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        for(int i =0;i<n;i++){
            a[i] = sc.nextInt();
        }
        Solution s = new Solution();
        s.rotate(a,k);
         for(int i =0;i<n;i++){
            System.out.print(a[i] + " ");
         }
    }
}