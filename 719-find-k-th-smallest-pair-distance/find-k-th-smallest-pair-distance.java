class Solution {
    public static int smallestDistancePair(int[] nums, int k) {
        Arrays.sort(nums);
        int left = 0;
        int right = nums[nums.length - 1] - nums[0];

        while (left < right) {
            int mid = (left + right) / 2;
            int count = 0;
            int l = 0;
            for (int r = 0; r < nums.length; r++) {
                while (nums[r] - nums[l] > mid) {
                    l++;
                }
                count += r - l;
            }
            if (count >= k) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
        
    }
}