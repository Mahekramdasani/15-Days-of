/*
 * Given a string text, you want to use the characters of text to form as many instances of the word "balloon" as possible. You can use each character in text at most once. Return the maximum number of instances that can be formed.

Example 1: Input: text = "nlaebolko" Output: 1

Example 2: Input: text = "loonbalxballpoon" Output: 2

Example 3: Input: text = "leetcode" Output: 0

Input Format

string of characters nlaebolko

Constraints

1 <= text.length <= 104 text consists of lower case English letters only.

Output Format

occurance in number 1

Sample Input 0

nlaebolko
Sample Output 0

1
Sample Input 1

loonbalxballpoon
Sample Output 1

2
 */
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] a = new int[26];
        for(int i = 0;i<s.length();i++){
            a[s.charAt(i)-'a']++;
        }
        int min = Integer.MAX_VALUE;
        min = Math.min(min,a[0]);
        min = Math.min(min,a[1]);
        min = Math.min(min,a[11]/2);
        min = Math.min(min,a[13]);
        min = Math.min(min,a[14]/2);
        System.out.println(min);
    }
}