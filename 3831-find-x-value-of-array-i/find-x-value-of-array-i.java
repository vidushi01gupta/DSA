class Solution {
    public static long[] resultArray(int[] nums, int k) {
        long[] result= new long[k];
        long[] dp= new long[k];
        for(int num:nums){
            long[] next= new long[k];
            int val=num%k;
            next[val]++;

            for(int j=0;j<k;j++){
                int newarr=(j*val)%k;
                next[newarr]+=dp[j];
            }

            for(int j=0;j<k;j++){
                result[j]+=next[j];
            }
            dp=next;
        }
        return result;
        
    }
}