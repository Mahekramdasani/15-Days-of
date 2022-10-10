/*
 * You are given an m x n integer matrix grid. We define an pattern(I-shape) as a part of the matrix with the following form:
                                             _______
                                             |A|B|C|
                                             | |D| |
                                             |E|F|G|

Return the maximum sum of the elements of an pattern. Note that an hourglass cannot be rotated and must be entirely contained within the matrix.

Input Format

m = 3  n = 3
matrix = [[1,2,3],[4,5,6],[7,8,9]]

Constraints

m == grid.length
n == grid[i].length
3 <= m, n <= 150
0 <= grid[i][j] <= 106

Output Format

35 (Explanation:1+2+3+5+7+8+9)

Sample Input 0

3
3
1 2 3 4 5 6 7 8 9
Sample Output 0

35

Sample Input 1

4
4
6 2 1 3 4 2 1 5 9 2 8 7 4 1 2 9
Sample Output 1

30
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static int maxSum(int arr[][], int m,int n)
    {
        int max_sum = Integer.MIN_VALUE;
        int currSum = 0;
        
        for (int i = 0; i < m - 2; i++) {
            for (int j = 0; j < n-2; j++){    
                if(j == 0)
                    currSum = arr[i][0] + arr[i][1] + arr[i][2] + arr[i + 1][1] + arr[i + 2][0] + arr[i + 2][1] + arr[i + 2][2];
                else {
                    currSum = currSum - arr[i][j - 1] - arr[i + 2][j - 1] - arr[i + 1][j] + arr[i][j + 2] + arr[i + 1][j + 1] + arr[i + 2][j + 2];
                }
                
                max_sum = Math.max(max_sum, currSum);
            }
        }
        return max_sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int m=sc.nextInt();
        int n = sc.nextInt();
        int[][] a = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                a[i][j] = sc.nextInt();
            }
        }
        int k = maxSum(a,m,n);
        System.out.println(k);
    }
}