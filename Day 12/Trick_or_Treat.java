/*
 * A shop is selling candies at a discount. For every two candies sold, the shop gives a third candy for free. The customer can choose any candy to take away for free as long as the cost of the chosen candy is less than or equal to the minimum cost of the two candies bought. For example, if there are 4 candies with costs 1, 2, 3, and 4, and the customer buys candies with costs 2 and 3, they can take the candy with cost 1 for free, but not the candy with cost 4. Given a 0-indexed integer array cost, where cost[i] denotes the cost of the ith candy, return the minimum cost of buying all the candies. Example 1: Input: cost = [6,5,7,9,2,2] Output: 23 Explanation: The way in which we can get the minimum cost is described below: - Buy candies with costs 9 and 7 - Take the candy with cost 6 for free - We buy candies with costs 5 and 2 - Take the last remaining candy with cost 2 for free Hence, the minimum cost to buy all candies is 9 + 7 + 5 + 2 = 23.

Input Format

6 6 5 7 9 2 2

Constraints

1 <= cost.length <= 100 1 <= cost[i] <= 100

Output Format

23

Sample Input 0

3
1 2 3
Sample Output 0

5
Sample Input 1

6
6 5 7 9 2 2
Sample Output 1

23
 */
import java.io.*;
import java.util.*;

public class Solution {
     static void reverse(int a[], int n) 
    { 
        int i, k, t; 
        for (i = 0; i < n / 2; i++) { 
            t = a[i]; 
            a[i] = a[n - i - 1]; 
            a[n - i - 1] = t; 
        } 
  
     }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0;i < n;i++){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        reverse(a,n);
        int i =0,k=1;
        int sum = 0;
        while(i!=n){
            if(k%3 == 0){
                k++;
                i++;
                continue;
            }
            sum = sum + a[i];
            k++;
            i++;
        }
        System.out.println(sum);
    }
}