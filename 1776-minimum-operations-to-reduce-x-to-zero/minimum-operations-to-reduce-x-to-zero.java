class Solution {
    public static int minOperations(int[] nums, int x) {
        int n=nums.length;
        int total=0;
        for(int num:nums){
            total+=num;
        }
        int target = total-x;
        if(target<0){
            return -1;
        }
        if(target==0){
            return n;
        }
        int left=0;
        int sum=0;
        int maxlength=-1;
        for(int right=0;right<n;right++){
            sum+=nums[right];
            while(sum>target && left <= right){
            sum-=nums[left];
            left++;
            }
            if(sum == target){
            maxlength=Math.max(maxlength, right-left+1);
            }
        }
        if(maxlength==-1){
            return -1;
        }
        return n-maxlength;
    }
}