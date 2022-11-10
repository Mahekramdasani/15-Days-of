/*
 * A valid encoding of an array of words is any reference string s and array of indices indices such that: words.length == indices.length The reference string s ends with the '#' character. For each index indices[i], the substring of s starting from indices[i] and up to (but not including) the next '#' character is equal to words[i]. Given an array of words, return the length of the shortest reference string s possible of any valid encoding of words.

Example 1: Input: words = ["time", "me", "bell"] Output: 10 Explanation: A valid encoding would be s = "time#bell#" and indices = [0, 2, 5]. words[0] = "time", the substring of s starting from indices[0] = 0 to the next '#' is underlined in "time#bell#" words[1] = "me", the substring of s starting from indices[1] = 2 to the next '#' is underlined in "time#bell#" words[2] = "bell", the substring of s starting from indices[2] = 5 to the next '#' is underlined in "time#bell#"

Input Format

3 time me bell

Constraints

1 <= words.length <= 2000 1 <= words[i].length <= 7 words[i] consists of only lowercase letters.

Output Format

10

Sample Input 0

3
time me bell
Sample Output 0

10
Sample Input 1

1
t
Sample Output 1

2
 */
import java.io.*;
import java.util.*;
class TrieNode {
    public TrieNode[] children;
    public int height;
    public TrieNode() {
        children = new TrieNode[26];
        height = 0;
    }
}
public class Solution {
public int minimumLengthEncoding(String[] words) {
        TrieNode root = new TrieNode();
        for (String word: words) insert(root, word);
        
        Stack<TrieNode> stack = new Stack<>();
        stack.add(root);
        
        int size = 0;
        while (!stack.isEmpty()) {
            TrieNode node = stack.pop();
            int numOfChildren = 0;
            for (TrieNode child: node.children) {
                if (child == null) continue;
                numOfChildren++;
                stack.add(child);
            }
            if (numOfChildren == 0) size += node.height + 1;
        }
        
        return size;
    }
    
    private void insert(TrieNode root, String word) {
        for (int i=word.length()-1; i>=0; i--) {
            char c = word.charAt(i);
            if (root.children[c - 'a'] == null) 
                root.children[c - 'a'] = new TrieNode();
            int prevHeight = root.height;
            root = root.children[c - 'a'];
            root.height = prevHeight + 1;
        }
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n];
        for(int i =0;i<n;i++){
            s[i] = sc.next();
        }
        Solution st = new Solution();
        System.out.println(st.minimumLengthEncoding(s));
    }
}