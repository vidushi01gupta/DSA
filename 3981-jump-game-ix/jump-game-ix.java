class Solution {
    public static int[] maxValue(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int[] suffixmin = new int[n];
        suffixmin[n-1] = nums[n-1];
        for(int i=n-2;i>=0;i--){
            suffixmin[i] = Math.min(nums[i], suffixmin[i+1]);
        }
        int prefixmax = Integer.MIN_VALUE;
        int start=0;
        for(int i=0;i<n;i++){
            prefixmax = Math.max(prefixmax, nums[i]);
            if(i==n-1 || prefixmax<=suffixmin[i+1]){
                for(int j=start;j<=i;j++){
                    ans[j] = prefixmax;
                }
                start=i+1;
            }
        }
        return ans;
    }
}