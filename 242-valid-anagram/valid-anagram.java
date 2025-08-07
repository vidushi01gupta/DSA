class Solution {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] count = new int[26]; 
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;  // Increment for s
            count[t.charAt(i) - 'a']--;  // Decrement for t
        }
        for (int c : count) {
            if (c != 0) return false; // Any non-zero count means not anagram
        }

        return true;
    }
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(isAnagram(s, t));
    }
        
    
}