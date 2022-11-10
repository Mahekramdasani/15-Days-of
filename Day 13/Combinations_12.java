/*
Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent. Return the answer in any order.

A mapping of digits to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.

                        1       2abc    3def  
                        4ghi    5jkl    6mno
                        7pqrs   8tuv    9wxyz

Input Format

"23"
Constraints

0 <= digits.length <= 4
digits[i] is a digit in the range ['2', '9'].
Output Format

ad ae af bd be bf cd ce cf
*/
import java.io.*;
import java.util.*;

public class Solution {
    public static List<String> letterCombinations(String digits) {
        ArrayList<String> AL = new ArrayList<String>();
        if (digits.isEmpty()) {
            return AL;
        }
        LKC(digits, "", AL);
        return AL;
    }
    public static void LKC(String number, String path, ArrayList<String> AL) {
        if (number.isEmpty()) {
            AL.add(path);
            return;
        }
        char ch = number.charAt(0);
        String rem = number.substring(1);
        String options = getComb(ch);
        for (int i = 0; i < options.length(); i++) {
            LKC(rem, path + options.charAt(i), AL);
        }
    }
    public static String getComb(char ch) {
        if (ch == '2') {
            return "abc";
        } else if (ch == '3') {
            return "def";
        } else if (ch == '4') {
            return "ghi";
        } else if (ch == '5') {
            return "jkl";
        } else if (ch == '6') {
            return "mno";
        } else if (ch == '7') {
            return "pqrs";
        } else if (ch == '8') {
            return "tuv";
        } else if (ch == '9') {
            return "wxyz";
        }
        return "";
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        List<String> l = letterCombinations(s);
        for(String i:l){
            System.out.print(i+" ");
        }
    }
}