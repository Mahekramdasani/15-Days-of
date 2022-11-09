/*
 * Given an array of integers nums, sort the array in increasing order based on the frequency of the values. If multiple values have the same frequency, sort them in decreasing order. Return the sorted array.

Example 1: Input: nums = [1,1,2,2,2,3] Output: [3,1,1,2,2,2] Explanation: '3' has a frequency of 1, '1' has a frequency of 2, and '2' has a frequency of 3.

Example 2: Input: nums = [2,3,1,3,2] Output: [1,3,3,2,2] Explanation: '2' and '3' both have a frequency of 2, so they are sorted in decreasing order.

Example 3: Input: nums = [-1,1,-6,4,5,-6,1,4,1] Output: [5,-1,4,4,-6,-6,1,1,1]

Input Format

6 1 1 2 2 2 3

Constraints

1 <= nums.length <= 100 -100 <= nums[i] <= 100

Output Format

3 1 1 2 2 2

Sample Input 0

6
1 1 2 2 2 3
Sample Output 0

3 1 1 2 2 2
Sample Input 1

5
2 3 1 3 2
Sample Output 1

1 3 3 2 2
 */
import java.io.*;
import java.util.*;

public class Solution {
     public static int[] frequencySort(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for(int i:nums){
            list.add(i);
            map.put(i,map.getOrDefault(i,0)+1);
        }
        
        Collections.sort(list,(a,b)->{
            if(map.get(a)==map.get(b)){
                return b-a;
            }
            return map.get(a)-map.get(b);
        });
        
        int res[] = new int[list.size()];
        for(int i=0;i<list.size();i++){
            res[i]=list.get(i);
        }
        return res;
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0;i< n ;i++){
            a[i] = sc.nextInt();
        }
        int[] k = frequencySort(a);
        for(int i: k){
            System.out.print(i +" ");
        }
        
    }
}