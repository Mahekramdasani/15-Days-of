/*
 * Given an array of strings words, return the words that can be typed using letters of the alphabet on only one row of American keyboard like the image below. In the American keyboard: the first row consists of the characters "qwertyuiop", the second row consists of the characters "asdfghjkl", and the third row consists of the characters "zxcvbnm".

Example 1: Input: words = ["Hello","Alaska","Dad","Peace"] Output: ["Alaska","Dad"]

Example 2: Input: words = ["omk"] Output: []

Example 3: Input: words = ["adsdf","sfd"] Output: ["adsdf","sfd"]

Input Format

4 Hello Alaska Dad Peace

Constraints

1 <= words.length <= 20 1 <= words[i].length <= 100 words[i] consists of English letters (both lowercase and uppercase). Each array contains minimum one answer

Output Format

Alaska Dad

Sample Input 0

4
Hello Alaska Dad Peace
Sample Output 0

Alaska Dad
Sample Input 1

2
omk mxcn
Sample Output 1

mxcn
 */
import java.io.*;
import java.util.*;

public class Solution {
      public static String[] findWords(String[] words) {
        String s1 = "qwertyuiopQWERTYUIOP";
        String s2 = "asdfghjklASDFGHJKL";
        String s3 = "zxcvbnmZXCVBNM"; 
        ArrayList<String> l = new ArrayList<>();
        for(int i=0;i<words.length;i++){
            int c1=0,c2=0,c3=0,len=words[i].length();
            for(int j=0;j<len;j++){
                if(s1.contains(Character.toString(words[i].charAt(j))))
                    c1++;
                else if(s2.contains(Character.toString(words[i].charAt(j))))
                    c2++;
                else if(s3.contains(Character.toString(words[i].charAt(j))))
                    c3++;
                if(c1==len || c2==len || c3==len)
                    l.add(words[i]);
            }
        }
        String ans[] = new String[l.size()];
        l.toArray(ans);
        return ans;
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n];
        for(int i = 0;i < n;i++){
            s[i] = sc.next();
        }
        String[] k = findWords(s);
        for(int i=0;i<k.length;i++){
            System.out.print(k[i] + " ");
        }
    }
}