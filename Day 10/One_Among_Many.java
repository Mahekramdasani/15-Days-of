/*
 * Given an integer n, return the count of all numbers with unique digits, x, where 0 <= x < 10n.

Example 1: Input: n = 2 Output: 91 Explanation: The answer should be the total numbers in the range of 0 ≤ x < 100, excluding 11,22,33,44,55,66,77,88,99

Example 2: Input: n = 0 Output: 1

Input Format

0

Constraints

0 <= n <= 8

Output Format

1

Sample Input 0

0
Sample Output 0

1
Sample Input 1

1
Sample Output 1

10
 */
import java.io.*;
import java.util.*;

public class Solution {
     public static int countNumbersWithUniqueDigits(int n) 
    {
        if(n == 0)
            return 1;
        
        if(n == 1)
            return 10;
        
        int product =9;
        int result = 10;
        
        for(int i=2; i<=n; i++)
        {
            product = product * (11-i);
            result += product;
        }
        
        return result;
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(countNumbersWithUniqueDigits(n));
    }
}