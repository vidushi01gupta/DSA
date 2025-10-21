class Solution {
    public static int smallestDivisor(int[] nums, int threshold) {
        int start=1;
        int end=0;
        for(int i=0;i<nums.length;i++){
            end=Math.max(end,nums[i]);
        }
        int result=end;
        while(start<=end){
            int mid=start+(end-start)/2;
            if (canDivide(nums, mid, threshold)) {
                result = mid;     
                end = mid - 1;
            } else {
                start = mid + 1;      
            }
        }
        return result;
    }

    public static boolean canDivide(int[] nums, int d, int threshold) {
        int sum = 0;
        for (int i=0;i<nums.length;i++) {
            sum += (nums[i] + d - 1) / d;
            if (sum > threshold) return false; 
        }
        return sum <= threshold;
     
    }
    public static void main(String[] args){
        int nums[]={1,2,5,9};
        int threshold=5;
        smallestDivisor(nums,threshold);
    }
}