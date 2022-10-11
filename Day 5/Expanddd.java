/*
 * Given an encoded string, return its decoded string. 
 * The encoding rule is: k[encoded_string], where the encoded_string inside the square brackets is being repeated exactly k times.
 *  Note that k is guaranteed to be a positive integer.
 *  You may assume that the input string is always valid; there are no extra white spaces, square brackets are well-formed, etc. 
 * Furthermore, you may assume that the original data does not contain any digits and that digits are only for those repeat numbers, k.
 *  For example, there will not be input like 3a or 2[4]. 
 * The test cases are generated so that the length of the output will never exceed 105.

Input Format

3[a]2[bc]

Constraints

1 <= s.length <= 30
s consists of lowercase English letters, digits, and square brackets '[]'.
s is guaranteed to be a valid input.
All the integers in s are in the range [1, 300].
Output Format

aaabcbc
Sample Input 0

3[a]2[bc]
Sample Output 0

aaabcbc
Sample Input 1

3[a2[c]]
Sample Output 1

accaccacc
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static String decodeString(String s) {   
    Stack<Integer> counts = new Stack<>();
    Stack<String> result = new Stack<>();
    String res = "";
    int index = 0;
    
    while(index < s.length()) {
        
        if(Character.isDigit(s.charAt(index))) {
            
            int count = 0;
            while(Character.isDigit(s.charAt(index))) {
                count = count * 10 + (s.charAt(index) - '0');
                index++;
            }
            counts.push(count);
            
        } else if(s.charAt(index) == '[') {
            
            result.push(res);
            res = "";
            index++;
            
        } else if(s.charAt(index) == ']') {
            
            StringBuilder sb = new StringBuilder(result.pop());
            int count = counts.pop();
            for(int i = 0; i<count; i++) {
                sb.append(res);
            }
            res = sb.toString();
            index++;

        } else {
            
            res += s.charAt(index);
            index++;
        }
    }
    
    return res;
}
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String k = decodeString(s);
        System.out.println(k);
    }
}