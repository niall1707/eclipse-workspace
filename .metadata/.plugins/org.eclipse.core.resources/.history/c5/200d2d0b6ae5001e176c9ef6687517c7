package test3;

public class Solution {
    public String reverseWords(String s) {
        // Split the string into words
        String[] words = s.split(" ");
        
        // StringBuilder to construct the reversed string
        StringBuilder reversed = new StringBuilder();
        
        // Append the words in reverse order
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i > 0) {
                reversed.append(" "); // Add space between words
            }
        }
        
        return reversed.toString();
    }
    
    public static void main(String[] args) {
        Solution solution = new Solution();
        String reversedString = solution.reverseWords("hello world");
        System.out.println(reversedString); // Output: "world hello"
    }
}
