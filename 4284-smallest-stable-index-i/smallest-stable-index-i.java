class Solution {
    public static int firstStableIndex(int[] nums, int k) {
        int n= nums.length;
        int min_suffix[]= new int[n];
        min_suffix[n-1]= nums[n-1];
        for(int i=n-2;i>=0;i--){
            min_suffix[i]=Math.min(nums[i], min_suffix[i+1]);
        }
        int max_prefix=nums[0];
        for(int i=0;i<n;i++){
            max_prefix = Math.max(max_prefix, nums[i]);
            int instability= max_prefix-min_suffix[i];
            if(instability<=k){
                return i;
            }
        }
        
        return -1;
        
    }
}