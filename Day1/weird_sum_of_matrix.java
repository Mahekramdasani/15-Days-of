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