/*
 * Given two positive integers a and b, return the number of common factors of a and b. An integer x is a common factor of a and b if x divides both a and b.

Input Format

 a = 12, b = 6
Constraints

1 <= a, b <= 1000
Output Format

4

Sample Input 0

12
6
Sample Output 0

4
Explanation 0

The common factors of 12 and 6 are 1, 2, 3, 6.
Sample Input 1

25
30
Sample Output 1

2
Explanation 1

The common factors of 25 and 30 are 1, 5.
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
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = 0,i;
        int min = a>b?b:a;
        for(i=1;i<=min;i++){
            if(a%i == 0 && b%i == 0){
                c++;
            }
        }
        System.out.println(c);
    }
}