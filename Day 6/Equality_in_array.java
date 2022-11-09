/*
 * You are given a 0-indexed integer array nums whose length is a power of 2.

Apply the following algorithm on nums:

1. Let n be the length of nums. If n == 1, end the process. Otherwise, create a new 0-indexed integer array newNums of length n / 2.
2. For every even index i where 0 <= i < n / 2, assign the value of newNums[i] as min(nums[2 * i], nums[2 * i + 1]).
3. For every odd index i where 0 <= i < n / 2, assign the value of newNums[i] as max(nums[2 * i], nums[2 * i + 1]).
4. Replace the array nums with newNums.
5. Repeat the entire process starting from step 1.
6. Return the last number that remains in nums after applying the algorithm.
Input Format

length = 8
nums = [1,3,5,2,4,8,2,2]
Constraints

1 <= nums.length <= 1024
1 <= nums[i] <= 109
nums.length is a power of 2.
Output Format

1
Sample Input 0

8
1 3 5 2 4 8 2 2
Sample Output 0

1
Explanation 0

image

The following arrays are the results of applying the algorithm repeatedly.
First: nums = [1,5,4,2]
Second: nums = [1,4]
Third: nums = [1]
1 is the last remaining number, so we return 1.
Sample Input 1

1
3
Sample Output 1

3
Explanation 1

3 is already the last remaining number, so we return 3.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static int[] evenIndex(int nums[],int n){
        if(n==1){
            return nums;
        }else{
            int[] newNums = new int[n/2];
            for(int i=0;i<n/2;i++){
                if(i%2 == 0){
                    newNums[i] = (int)Math.min(nums[2*i],nums[2*i+1]);
                }else{
                    newNums[i] = (int)Math.max(nums[2*i],nums[2*i+1]);
                }
            }
            return evenIndex(newNums,n/2);
        }
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0;i < n;i++){
            nums[i] = sc.nextInt();
        }
        int[] k = evenIndex(nums,n);
        System.out.println(k[0]);
    }
}