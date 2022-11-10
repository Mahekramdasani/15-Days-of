/*
 * International Morse Code defines a standard encoding where each letter is mapped to a series of dots and dashes, as follows:

'a' maps to ".-",
'b' maps to "-...",
'c' maps to "-.-.", and so on.
For convenience, the full table for the 26 letters of the English alphabet is given below: [".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."]

Given an array of strings words where each word can be written as a concatenation of the Morse code of each letter.

For example,"cab" can be written as "-.-..--...", which is the concatenation of "-.-.", ".-", and "-...". We will call such a concatenation the transformation of a word. Return the number of different transformations among all words we have.

Input Format

4
gin zen gig msg
Constraints

1 <= words.length <= 100
1 <= words[i].length <= 12
words[i] consists of lowercase English letters.
Output Format

2
 */
import java.io.*;
import java.util.*;

public class Solution {
    public static void morseCode(HashMap<Character,String> m){
         m.put('a',".-");
         m.put('b',"-...");
         m.put('c',"-.-.");
         m.put('d',"-..");
         m.put('e',".");
         m.put('f',"..-.");
         m.put('g',"--.");
         m.put('h',"....");
         m.put('i',"..");
         m.put('j',".---");
         m.put('k',"-.-");
         m.put('l',".-..");
         m.put('m',"--");
         m.put('n',"-.");
         m.put('o',"---");
         m.put('p',".--.");
         m.put('q',"--.-");
         m.put('r',".-.");
         m.put('s',"...");
         m.put('t',"-");
         m.put('u',"..-");
         m.put('v',"...-");
         m.put('w',".--");
         m.put('x',"-..-");
         m.put('y',"-.--");
         m.put('z',"--..");
        
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        HashMap<Character,String> m = new HashMap<>();
        morseCode(m);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] k = new String[n];
        for(int i=0;i<n;i++){
            k[i] = sc.next();
        }
        // System.out.println(m);
        Set<String> s = new HashSet<String>();
        for(int i =0;i<n;i++){
            String p ="";
            for(int j = 0;j<k[i].length();j++){
                p = p + m.get(k[i].charAt(j));
            }
            s.add(p);
        }
        System.out.println(s.size());
    }
}