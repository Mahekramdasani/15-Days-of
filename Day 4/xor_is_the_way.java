

 /*
 * You are given an integer array pref of size n. Find and return the array arr of size n that satisfies:

pref[i] = arr[0] ^ arr[1] ^ ... ^ arr[i].

Note that ^ denotes the bitwise-xor operation.

It can be proven that the answer is unique.

Input Format

length = 5
pref = [5,2,0,3,1]
Constraints

1 <= pref.length <= 105
0 <= pref[i] <= 106
Output Format

5 7 2 3 2
Sample Input 0

5
5 2 0 3 1
Sample Output 0

5 7 2 3 2
Explanation 0

From the array [5,7,2,3,2] we have the following:
- pref[0] = 5.
- pref[1] = 5 ^ 7 = 2.
- pref[2] = 5 ^ 7 ^ 2 = 0.
- pref[3] = 5 ^ 7 ^ 2 ^ 3 = 3.
- pref[4] = 5 ^ 7 ^ 2 ^ 3 ^ 2 = 1.
Sample Input 1

1
13
Sample Output 1

13
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static int[] xor(int arr[], int n,int pref)
    {   
        int i,j;
        int p[] = new int[n];
        p[0] = pref;
        for(i=0;i<n-1;i++){
            for(j=0;j<2;j++){
                p[i+1] = p[i+1] ^ arr[i+j];
            }
        }
        return p;
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] pref = new int[n];
        for(int i = 0;i<n;i++){
            a[i] = sc.nextInt();
        }
        int i;
        pref = xor(a,n,a[0]);
        for(i=0;i<n;i++){
            System.out.print(pref[i] + " ");
        }
    }
}