class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;
        
        int[] s1Count = new int[26];
        int[] s2Count = new int[26];
        
        // Count frequency of chars in s1 and first window in s2
        for (int i = 0; i < s1.length(); i++) {
            s1Count[s1.charAt(i) - 'a']++;
            s2Count[s2.charAt(i) - 'a']++;
        }
        // Check initial window
        if (matches(s1Count, s2Count)) return true;
        // Sliding window
        for (int i = s1.length(); i < s2.length(); i++) {
            s2Count[s2.charAt(i) - 'a']++; // Add new char
            s2Count[s2.charAt(i - s1.length()) - 'a']--; // Remove old char
            
            if (matches(s1Count, s2Count)) return true;
        }
        
        return false;
    }
    private boolean matches(int[] arr1, int[] arr2) {
        for (int i = 0; i < 26; i++) {
            if (arr1[i] != arr2[i]) return false;
        }
        return true;
    }
    
}