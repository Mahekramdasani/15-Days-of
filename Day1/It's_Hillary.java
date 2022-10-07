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
        int c=0,i,j;
        int[] a = new int[n];
        for(i=0;i<n;i++){
            a[i] =sc.nextInt();
        }
        for(i=1;i<n-1;i++){
            if(a[i] == a[i+1]){
                if(a[i]>a[i+2] && a[i]>a[i-1] ){
                    c++;
                }
                if(a[i]<a[i+2] && a[i]<a[i-1]){
                    c++;
                }
            }
                if(a[i]>a[i+1] && a[i]>a[i-1] ){
                    c++;
                }
                if(a[i]<a[i+1] && a[i]<a[i-1]){
                    c++;
                }
        }
        System.out.println(c);
    }
}
