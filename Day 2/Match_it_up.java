/*
 * Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise. 
 * Each letter in the magazine can only be used once in ransomNote.

Example 1: Input: ransomNote = "a", magazine = "b" Output: false

Example 2: Input: ransomNote = "aa", magazine = "ab" Output: false

Example 3: Input: ransomNote = "aa", magazine = "aab" Output: true

Input Format

a b

Constraints

1 <= ransomNote.length, magazine.length <= 105 ransomNote and magazine consist of lowercase English letters.

Output Format

false

Sample Input 0

a
b
Sample Output 0

false
Sample Input 1

aa
aab
Sample Output 1

true
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static boolean construct(String ransomNote,String magazine){
        int[] m = new int[26];
        for(int i = 0; i < magazine.length(); i++)
            m[magazine.charAt(i)-'a']++;
        for(int i = 0; i < ransomNote.length(); i++)
            if(m[ransomNote.charAt(i)-'a']-- == 0)
                return false;
        return true;
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        String y = sc.nextLine();
        System.out.println(construct(x,y));
    }
}