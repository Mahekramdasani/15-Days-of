/*
 * A string s is nice if, for every letter of the alphabet that s contains, it appears both in uppercase and lowercase. For example, "abABB" is nice because 'A' and 'a' appear, and 'B' and 'b' appear. However, "abA" is not because 'b' appears, but 'B' does not. Given a string s, return the longest substring of s that is nice. If there are multiple, return the substring of the earliest occurrence. If there are none, return an empty string.

Example 1: Input: s = "YazaAay" Output: "aAa" Explanation: "aAa" is a nice string because 'A/a' is the only letter of the alphabet in s, and both 'A' and 'a' appear. "aAa" is the longest nice substring.

Example 2: Input: s = "Bb" Output: "Bb" Explanation: "Bb" is a nice string because both 'B' and 'b' appear. The whole string is a substring.

Input Format

YazaAay

Constraints

1 <= s.length <= 100 s consists of uppercase and lowercase English letters.

Output Format

aAa

Sample Input 0

YazaAay
Sample Output 0

aAa
Sample Input 1

Bb
Sample Output 1

Bb
 */
import java.io.*;
import java.util.*;

public class Solution {
     public static String longestNiceSubstring(String s) {
        if (s.length() < 2) return "";
        char[] arr = s.toCharArray();
        Set<Character> set = new HashSet<>();
        for (char c: arr) set.add(c);
        for (int i = 0; i < arr.length; i++) {
            char c = arr[i];
            if (set.contains(Character.toUpperCase(c)) && set.contains(Character.toLowerCase(c))) continue;
            String sub1 = longestNiceSubstring(s.substring(0, i));
            String sub2 = longestNiceSubstring(s.substring(i+1));
            return sub1.length() >= sub2.length() ? sub1 : sub2;
        }
        return s; 
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(longestNiceSubstring(s));
    }
}