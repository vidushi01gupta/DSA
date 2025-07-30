class Solution {
    public static int lengthOfLongestSubstring(String s) {
         int[] lastIndex = new int[256]; 
        for (int i = 0; i < 256; i++) {
            lastIndex[i] = -1; 
        }

        int maxLength = 0;
        int start = 0; 

        for (int end = 0; end < s.length(); end++) {
            char c = s.charAt(end);
            if (lastIndex[c] >= start) {
                start = lastIndex[c] + 1;
            }
            lastIndex[c] = end;
            maxLength = Math.max(maxLength, end - start + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s)); 
    }
}
