/*
 * You are given a 0-indexed integer array nums of size n and a positive integer k. We call an index i in the range k <= i < n - k good if the following conditions are satisfied: The k elements that are just before the index i are in non-increasing order. The k elements that are just after the index i are in non-decreasing order. Return an array of all good indices sorted in increasing order.

Example 1: Input: nums = [2,1,1,1,3,4,1], k = 2 Output: [2,3] Explanation: There are two good indices in the array: - Index 2. The subarray [2,1] is in non-increasing order, and the subarray [1,3] is in non-decreasing order. - Index 3. The subarray [1,1] is in non-increasing order, and the subarray [3,4] is in non-decreasing order. Note that index 4 is not good because [4,1] is not non-decreasing. Example 2: Input: nums = [2,1,1,2], k = 2 Output: [] Explanation: There are no good indices in this array.

Input Format

length = 7 k = 2 arr = [2, 1, 1, 1, 3, 4, 1]

Constraints

n == nums.length
3 <= n <= 105
1 <= nums[i] <= 106
1 <= k <= n / 2
Output Format

2 3
Sample Input 0

7
2
2 1 1 1 3 4 1
Sample Output 0

2 3
Sample Input 1

12 
2
1 3 3 8 8 8 9 9 9 8 8 10
Sample Output 1

3 5 6 8 9
 */
import java.io.*;
import java.util.*;

public class Solution {
    public static boolean isSortedAs(int[] array) {
    for (int i = 0; i < array.length - 1; i++) {
        if (array[i] > array[i + 1])
            return false;
    }
    return true;
}
    public static boolean isSortedDs(int[] array) {
    for (int i = 0; i < array.length - 1; i++) {
        if (array[i] < array[i + 1])
            return false;
    }
    return true;
}
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        int[] ans = new int[n];
        int ind = 0;
        for(int i =0;i<n;i++){
            a[i] = sc.nextInt();
        }
        for(int i = k;i<n-k;i++){
            int[] arr = new int[k];
            int j = i-1;
            int p=0;
            while(p<k){
                arr[p] = a[j];
                j--;
                p++;
            }
            // arr[j] = a[j];
            int[] ar = new int[k];
            for(j=i+1,p=0;j<=i+k;j++,p++){
                ar[p] = a[j];
            }
            if(isSortedAs(arr) && isSortedAs(ar)){
                ans[ind] = i;
                ind++;
            }
        }
        for(int i=0;i<ans.length;i++)
            if(ans[i]==0)
                continue;
            else
                System.out.print(ans[i]+" ");
    }
}