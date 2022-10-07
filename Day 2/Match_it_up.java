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