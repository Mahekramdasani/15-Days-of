/*
 * You have a water dispenser that can dispense cold, warm, and hot water. 
 * Every second, you can either fill up 2 cups with different types of water, or 1 cup of any type of water. 
 * You are given a 0-indexed integer array amount of length 3 where amount[0], amount[1], and amount[2] 
 * denote the number of cold, warm, and hot water cups you need to fill respectively.
 *  Return the minimum number of seconds needed to fill up all the cups
 * Input Format

[1,4,2]
Constraints

amount.length == 3
0 <= amount[i] <= 100
Output Format

4
Sample Input 0

1 4 2
Sample Output 0

4
Explanation 0

One way to fill up the cups is:
Second 1: Fill up a cold cup and a warm cup.
Second 2: Fill up a warm cup and a hot cup.
Second 3: Fill up a warm cup and a hot cup.
Second 4: Fill up a warm cup.
It can be proven that 4 is the minimum number of seconds needed.
Sample Input 1

5 4 4
Sample Output 1

7
Explanation 1

One way to fill up the cups is:
Second 1: Fill up a cold cup, and a hot cup.
Second 2: Fill up a cold cup, and a warm cup.
Second 3: Fill up a cold cup, and a warm cup.
Second 4: Fill up a warm cup, and a hot cup.
Second 5: Fill up a cold cup, and a hot cup.
Second 6: Fill up a cold cup, and a warm cup.
Second 7: Fill up a hot cup.
Sample Input 2

5 0 0
Sample Output 2

5
Explanation 2

 Every second, we fill up a cold cup.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
      public static int fillCups(int[] A) {
        int mx = 0, sum = 0;
        for(int a: A) {
            mx = Math.max(a, mx);
            sum += a;
        }
        return Math.max(mx, (sum + 1) / 2);
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int[] am = new int[3];
        for(int i=0;i<3;i++){
            am[i] = sc.nextInt();
        }
        
        System.out.println(fillCups(am));
        
    }
}