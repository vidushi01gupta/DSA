class Solution {
    public static void moveZeroes(int[] nums) {
        int lastnonzerofoundat=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[lastnonzerofoundat]=nums[i];
                lastnonzerofoundat++;
            }
        }
        for(int i=lastnonzerofoundat;i<nums.length;i++){
            nums[i]=0;
        }

        
    }
    public static void main(String[] args){
        int nums[]={0,1,0,3,12};
        moveZeroes(nums);

    }
}