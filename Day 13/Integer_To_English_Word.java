/*
 * Convert a non-negative integer num to its English words representation.

Input Format

123

Constraints

0 <= num <= 231 - 1

Output Format

One Hundred Twenty Three

Sample Input 0

123
Sample Output 0

One Hundred Twenty Three
Sample Input 1

12345
Sample Output 1

Twelve Thousand Three Hundred Forty Five
Sample Input 2

123456
Sample Output 2

One Hundred Twenty Three Thousand Four Hundred Fifty Six
 */
import java.io.*;
import java.util.*;

public class Solution {
private final String[] LESS_THAN_20 = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
private final String[] TENS = {"", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
private final String[] THOUSANDS = {"", "Thousand", "Million", "Billion"};

public String numberToWords(int num) {
    if (num == 0) return "Zero";

    int i = 0;
    String words = "";
    
    while (num > 0) {
        if (num % 1000 != 0)
            words = helper(num % 1000) +THOUSANDS[i] + " " + words;
        num /= 1000;
        i++;
    }
    
    return words.trim();
}

private String helper(int num) {
    if (num == 0)
        return "";
    else if (num < 20)
        return LESS_THAN_20[num] + " ";
    else if (num < 100)
        return TENS[num / 10] + " " + helper(num % 10);
    else
        return LESS_THAN_20[num / 100] + " Hundred " + helper(num % 100);
}
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Solution k = new Solution();
        String s = k.numberToWords(n);
        System.out.println(s);
    }
}