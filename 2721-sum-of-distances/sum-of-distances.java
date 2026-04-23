class Solution {
    public static long[] distance(int[] nums) {
        int n = nums.length;
        long[] ans = new long[n];
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], new ArrayList<>());
            }
            map.get(nums[i]).add(i);
        }
        for (List<Integer> list : map.values()) {
            int m = list.size();
            long totalSum = 0;
            for (int idx : list) {
                totalSum += idx;
            }
            long leftSum = 0;
            for (int i = 0; i < m; i++) {
                int idx = list.get(i);

                long leftContribution = (long) idx * i - leftSum;
                long rightContribution = (totalSum - leftSum - idx) - (long) idx * (m - i - 1);
                ans[idx] = leftContribution + rightContribution;
                leftSum += idx;
            }
        }

        return ans;

        
    }
}