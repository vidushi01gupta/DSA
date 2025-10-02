class Solution {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int maxcount=0;
        int currcount=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                currcount++;
                maxcount=Math.max(maxcount,currcount);
            }
            else{
                currcount=0;
            }
        }
        return maxcount;
        
    }
    public static void main(String[] args){
        int nums[]={1,1,0,1,1,1};
        findMaxConsecutiveOnes(nums);

    }
}