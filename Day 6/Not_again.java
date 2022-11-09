/*
 * Given an array of integers arr, return true if the number of occurrences of each value in the array is unique, or false otherwise.

Example 1: Input: arr = [1,2,2,1,1,3] Output: true Explanation: The value 1 has 3 occurrences, 2 has 2 and 3 has 1. No two values have the same number of occurrences. Example 2: Input: arr = [1,2] Output: false

Example 3: Input: arr = [-3,0,1,-3,1,1,1,-3,10,0] Output: true

Input Format

1 2 2 1 1 3

Constraints

1 <= arr.length <= 1000 -1000 <= arr[i] <= 1000

Output Format

true

Sample Input 0

6
1 2 2 1 1 3
Sample Output 0

true
Sample Input 1

2
1 2
Sample Output 1

false
 */
import java.io.*;
import java.util.*;

public class Solution {
public static boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        Set<Integer> set = new HashSet<>();
        for (int i : map.keySet()) {
            if (set.contains(map.get(i))) {
                return false;
            }
            set.add(map.get(i));
        }
        return true;
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0;i< n;i++){
            a[i] = sc.nextInt();
        }
        System.out.println(uniqueOccurrences(a));
    }
}