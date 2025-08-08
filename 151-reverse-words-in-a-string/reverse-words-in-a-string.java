class Solution {
    public static String reverseWords(String s) {
         s = s.trim();
        String[] words = s.split("\\s+");
        
        // Reverse the words
        StringBuilder sb = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            if (i != 0) {
                sb.append(" ");
            }
        }
        
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "  the sky   is blue  ";
        System.out.println(reverseWords(s)); 
    }
        
    
}