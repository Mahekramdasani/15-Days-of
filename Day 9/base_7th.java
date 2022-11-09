/*
 * Given an integer num, return a string of its base 7 representation.

Example 1: Input: num = 100 Output: "202"

Example 2: Input: num = -7 Output: "-10"

Input Format

100

Constraints

-107 <= num <= 107

Output Format

202

Sample Input 0

100
Sample Output 0

202
Sample Input 1

-7
Sample Output 1

-10
 */
import java.io.*;
import java.util.*;

public class Solution {
    public static String convertToBase7(int n){
        if (n < 0) return "-" + convertToBase7(-n);
        if (n < 7) return Integer.toString(n);
        return convertToBase7(n / 7) + Integer.toString(n % 7);
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(convertToBase7(num));
    }
}