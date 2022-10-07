import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int i,j,k=0;
        for(i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        int c = 0;
        for(i=0;i<n;i++){
            for(j=i;j<n;j++){
                if(a[i] == a[j]){
                    c++;
                }
            }
            if(c>n/2){
                c=0;
                k = a[i];
            }
        }
        System.out.println(k);
    }
}
