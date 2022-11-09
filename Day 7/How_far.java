/*
Given a string s and a character c that occurs in s, return an array of integers answer where answer.length == s.length and answer[i] is the distance from index i to the closest occurrence of character c in s. The distance between two indices i and j is abs(i - j), where abs is the absolute value function.

Input Format

c = 'e'
s = "loveleetcode"
Constraints

1 <= s.length <= 104
s[i] and c are lowercase English letters.
It is guaranteed that c occurs at least once in s.
Output Format

3 2 1 0 1 0 0 1 2 2 1 0

Sample Input 0

loveleetcode
e
Sample Output 0

3 2 1 0 1 0 0 1 2 2 1 0
Explanation 0

The character 'e' appears at indices 3, 5, 6, and 11 (0-indexed).
The closest occurrence of 'e' for index 0 is at index 3, so the distance is abs(0 - 3) = 3.
The closest occurrence of 'e' for index 1 is at index 3, so the distance is abs(1 - 3) = 2.
For index 4, there is a tie between the 'e' at index 3 and the 'e' at index 5, but the distance is still the same: abs(4 - 3) == abs(4 - 5) = 1.
The closest occurrence of 'e' for index 8 is at index 6, so the distance is abs(8 - 6) = 2.
Sample Input 1

aaab
b
Sample Output 1

3 2 1 0
*/
import java.io.*;
import java.util.*;

public class Solution {
    public static int[] shortestToChar(String s, char c)
    {
    int[] arr=new int[s.length()];
        for(int i=0;i<s.length();i++)
        {
            int left=i-1;
            int right=i+1;
            while(left>=0 || right <s.length())
            {
                if(s.charAt(i)==c)
                {
                    arr[i]=0;
                    break;
                }
                
                if(right < s.length() && s.charAt(right) == c)
                {
                    arr[i]=right-i;
                    break;
                }
                if( left >= 0 && s.charAt(left)== c)
                {
                    arr[i]=i-left;
                    break;
                }
                left--;
                right++;
            }
        }
         return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char c =  sc.next().charAt(0);
        int[] a = shortestToChar(s,c);
        for(int i = 0;i<s.length();i++){
            System.out.print(a[i] + " ");
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}