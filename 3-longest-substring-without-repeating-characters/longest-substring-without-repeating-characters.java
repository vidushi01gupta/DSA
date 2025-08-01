class Solution {
    public static int lengthOfLongestSubstring(String s) {
        int[] lastIndex = new int[256];
        for (int i = 0; i < 256; i++) {
            lastIndex[i] = -1;
        }

        int maxLen = 0;
        int start = 0; 
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (lastIndex[ch] >= start) {
                start = lastIndex[ch] + 1;
            }

            lastIndex[ch] = i; 
            maxLen = Math.max(maxLen, i - start + 1);
        }

        return maxLen;
    }

    public static void main(String[] args) {
        Solution obj = new Solution();
        String input = "abcabcbb";
        System.out.println("Output: " + obj.lengthOfLongestSubstring(input)); 
    }
        
    
}