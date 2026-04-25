class Solution {
    public static long maxSubarraySum(int[] nums, int k) {
        int n = nums.length;
        long prefix = 0;
        long result = Long.MIN_VALUE;
        long[] minPrefix = new long[k];
        Arrays.fill(minPrefix, Long.MAX_VALUE);
        minPrefix[0] = 0;
        for (int i = 0; i < n; i++) {
            prefix += nums[i];
            int mod = (i + 1) % k;
            if (minPrefix[mod] != Long.MAX_VALUE) {
                result = Math.max(result, prefix - minPrefix[mod]);
            }
            minPrefix[mod] = Math.min(minPrefix[mod], prefix);
        }

        return result;
        
    }
}