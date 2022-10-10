/*
 * Given two strings s and goal, return true if you can swap two letters in s so the result is equal to goal, otherwise, return false. 
 * Swapping letters is defined as taking two indices i and j (0-indexed) such that i != j and swapping the characters at s[i] and s[j]. 
 * For example, swapping at indices 0 and 2 in "abcd" results in "cbad".

Example 1: Input: s = "ab", goal = "ba" Output: true Explanation: You can swap s[0] = 'a' and s[1] = 'b' to get "ba", which is equal to goal.

Example 2: Input: s = "ab", goal = "ab" Output: false Explanation: The only letters you can swap are s[0] = 'a' and s[1] = 'b', which results in "ba" != goal.

Example 3: Input: s = "aa", goal = "aa" Output: true Explanation: You can swap s[0] = 'a' and s[1] = 'a' to get "aa", which is equal to goal.

Input Format

ab ba

Constraints

1 <= s.length, goal.length <= 2 * 104 s and goal consist of lowercase letters.

Output Format

true
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static String toString(char[] a)
    {
        // Creating object of String class
        String string = new String(a);
 
        return string;
    }
     public static String swap(String str, int i, int j)
    {
        char ch[] = str.toCharArray();
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
        String s = toString(ch);
        return s;
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        int flag = 0;
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length();j++){
                if(swap(s,i,j).equals(t)){
                    flag = 1;
                    break;
                }
            }
        }
        if(flag == 1){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}