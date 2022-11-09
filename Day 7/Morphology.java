/*
 * Given two strings s and goal, return true if and only if s can become goal after some number of shifts on s. A shift on s consists of moving the leftmost character of s to the rightmost position. For example, if s = "abcde", then it will be "bcdea" after one shift.

Example 1: Input: s = "abcde", goal = "cdeab" Output: true

Example 2: Input: s = "abcde", goal = "abced" Output: false

Input Format

abcde cdeab

Constraints

1 <= s.length, goal.length <= 100 s and goal consist of lowercase English letters.

Output Format

true

Sample Input 0

abcde
cdeab
Sample Output 0

true
Sample Input 1

abcde
abced
Sample Output 1

false
 */
import java.io.*;
import java.util.*;

public class Solution {
    public static boolean rotateString(String s, String goal) 
{
    return (s.length()==goal.length() && (s+s).contains(goal));
}
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String g = sc.nextLine();
        System.out.println(rotateString(s,g));
    }
}