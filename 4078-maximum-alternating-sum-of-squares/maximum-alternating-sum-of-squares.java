class Solution {
    public static long maxAlternatingSum(int[] nums) {
        long sq[]=new long[nums.length];
        for(int i=0;i<nums.length;i++){
            sq[i]=(long)nums[i]*nums[i];
        }
        Arrays.sort(sq);
        long score=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(i<(nums.length+1)/2){
                score+=sq[n-1-i];
            }
            else{
                score-=sq[n-1-i];
            }
        }
        return score;
        
    }
}