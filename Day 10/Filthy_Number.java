/*
 * An ugly number is a positive integer whose prime factors are limited to 2, 3, and 5. Given an integer n, return the nth ugly number.

Example 1: Input: n = 10 Output: 12 Explanation: [1, 2, 3, 4, 5, 6, 8, 9, 10, 12] is the sequence of the first 10 ugly numbers.

Example 2: Input: n = 1 Output: 1 Explanation: 1 has no prime factors, therefore all of its prime factors are limited to 2, 3, and 5.

Input Format

1

Constraints

1 <= n <= 1690

Output Format

1

Sample Input 0

1
Sample Output 0

1
Sample Input 1

10
Sample Output 1

12
 */
import java.io.*;
import java.util.*;

public class Solution {
    public static int maxDivide(int a, int b)
    {
        while (a % b == 0)
            a = a / b;
        return a;
    }
  
    /* Function to check if a number
    is ugly or not */
    public static int isUgly(int no)
    {
        no = maxDivide(no, 2);
        no = maxDivide(no, 3);
        no = maxDivide(no, 5);
  
        return (no == 1) ? 1 : 0;
    }
  
    /* Function to get the nth ugly
    number*/
    public static int getNthUglyNo(int n)
    {
        int i = 1;
  
        // ugly number count
        int count = 1;
  
        // check for all integers
        // until count becomes n
        while (n > count) {
            i++;
            if (isUgly(i) == 1)
                count++;
        }
        return i;
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(getNthUglyNo(n));
    }
}