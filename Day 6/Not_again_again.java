/* 
Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.

Example 1: Input: s = "leetcode" Output: 0

Example 2: Input: s = "loveleetcode" Output: 2

Example 3: Input: s = "aabb" Output: -1

Input Format

leetcode

Constraints

1 <= s.length <= 105 s consists of only lowercase English letters.

Output Format

0
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int ind = -1,flag = 0;
        int[] a = new int[26];
        Arrays.fill(a, 8);
         for(int i =0;i<s.length();i++){
            flag = 0;
            for(int j = 0;j < s.length();j++){
                if(s.charAt(i) == s.charAt(j) && i!=j){
                    flag = 1;
                }
            }
            if(flag == 0){
                ind = i;
                break;
            }

        }
        if(flag == 0){
            System.out.println(ind);
        }else{
            System.out.println(-1);            
        }
    }
}