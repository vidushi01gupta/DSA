class Solution {
    public static int singleNumber(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            count^=nums[i];
        }
        return count;
        
    }
    public static void main(String[] args){
        int nums[]={2,2,1};
        singleNumber(nums);
    }
}