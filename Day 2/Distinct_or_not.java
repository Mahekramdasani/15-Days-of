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
        int flag = 0;
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j= i+1;j<n;j++){
                if(a[i] == a[j]){
                    flag =1;
                    break;
                }
            }
        }
        if(flag == 0){
            System.out.println("false");
        }else{
            System.out.println("true");
        }
    }
}
