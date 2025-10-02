class Solution {
    public static void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        if(k==0){
            return;
        }
        reversearray(nums,0,n-1);
        reversearray(nums,0,k-1);
        reversearray(nums,k,n-1);
    }

    public static void reversearray(int nums[], int start, int end){
        while(start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;

        }
    }
    public static void main(String[] args){
        int nums[]={1,2,3,4,5,6,7};
        int k=3;
        rotate(nums,k);
        
    }
}