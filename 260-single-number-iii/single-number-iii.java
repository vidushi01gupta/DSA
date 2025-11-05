class Solution {
    public static int[] singleNumber(int[] nums) {
        int xor=0;
        for(int i=0;i<nums.length;i++){
            xor^=nums[i];
        }
        int diffbit=xor&(-xor);
        int a=0;
        int b=0;
        for(int i=0;i<nums.length;i++){
            if((nums[i] & diffbit)==0){
                a^=nums[i];
            }
            else{
                b^=nums[i];
            }
        }
        return new int[]{a,b};
        
    }
    public static void main(String[] args){
        int nums[]={1,2,1,3,2,5};
        singleNumber(nums);
    }
}