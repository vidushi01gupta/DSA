class Solution {
    public static int minElement(int[] nums) {
        int min=nums[0];
        for(int i=0;i<nums.length;i++){
            int dsum=digitsum(nums[i]);
            min=Math.min(min,dsum);
        }
        return min;
        
    }
    public static int digitsum(int n){
        int sum=0;
        while(n>0){
            int digit=n%10;
            sum+=digit;
            n/=10;
        }
        return sum;
    }
}