/*
 * Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.

Example 1: Input: nums = [1,1,1,2,2,3], k = 2 Output: [1,2]

Example 2: Input: nums = [1], k = 1 Output: [1]

Follow up: Your algorithm's time complexity must be better than O(n log n), where n is the array's size.

Input Format

6 2 1 1 1 2 2 3

Constraints

1 <= nums.length <= 105 -104 <= nums[i] <= 104 k is in the range [1, the number of unique elements in the array]. It is guaranteed that the answer is unique.

Output Format

1 2

Sample Input 0

6
2
1 1 1 2 2 3
Sample Output 0

1 2
Sample Input 1

1
1
1
Sample Output 1

1
 */
import java.io.*;
import java.util.*;

public class Solution {
public static List<Integer> topKFrequent(int[] nums, int k) {

    List<Integer>[] bucket = new List[nums.length + 1];
    Map<Integer, Integer> frequencyMap = new HashMap<Integer, Integer>();

    for (int n : nums) {
        frequencyMap.put(n, frequencyMap.getOrDefault(n, 0) + 1);
    }

    for (int key : frequencyMap.keySet()) {
        int frequency = frequencyMap.get(key);
        if (bucket[frequency] == null) {
            bucket[frequency] = new ArrayList<>();
        }
        bucket[frequency].add(key);
    }

    List<Integer> res = new ArrayList<>();

    for (int pos = bucket.length - 1; pos >= 0 && res.size() < k; pos--) {
        if (bucket[pos] != null) {
            res.addAll(bucket[pos]);
        }
    }
    return res;
}
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int k = sc.nextInt();
        for(int i = 0;i< n;i++){
            a[i] = sc.nextInt();
        }
        List<Integer> l = topKFrequent(a,k);
        for(int i: l){
            System.out.print(i +" ");
        }
    }
}