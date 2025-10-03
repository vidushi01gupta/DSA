class Solution {
    public static int missingNumber(int[] nums) {
        int n=nums.length;
        int expectedsum=n*(n+1)/2;
        int actualsum=0;

        for(int i=0;i<n;i++){
            actualsum+=nums[i];
        }
        return expectedsum-actualsum;
        
    }
    public static void main(String[] args){
        int nums[]={3,0,1};
        missingNumber(nums);
    }
}