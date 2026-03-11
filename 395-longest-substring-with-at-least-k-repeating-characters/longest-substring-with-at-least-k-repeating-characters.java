class Solution {
    public static int longestSubstring(String s, int k) {
        int maxLen = 0;
        for (int target = 1; target <= 26; target++) {
            int[] freq = new int[26];
            int left = 0, right = 0;
            int count = 0;          
            int countAtLeastK = 0;  
            while (right < s.length()) {
                if (count <= target) {
                    int idx = s.charAt(right) - 'a';
                    if (freq[idx] == 0)
                        count++;
                    freq[idx]++;

                    if (freq[idx] == k)
                        countAtLeastK++;
                    right++;
                }

                while (count > target) {
                    int idx = s.charAt(left) - 'a';
                    if (freq[idx] == k)
                        countAtLeastK--;
                    freq[idx]--;

                    if (freq[idx] == 0)
                        count--;
                    left++;
                }

                if (count == target && count == countAtLeastK) {
                    maxLen = Math.max(maxLen, right - left);
                }
            }
        }

        return maxLen;
        
    }
}