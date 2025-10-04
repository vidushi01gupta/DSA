class Solution {
    public static int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] pos = new int[n / 2];
        int[] neg = new int[n / 2];
        int p = 0, q = 0;
        for (int i=0;i<nums.length;i++) {
            if (nums[i] > 0) {
                pos[p++] = nums[i];
            } else {
                neg[q++] = nums[i];
            }
        }
        int[] result = new int[n];
        int i = 0, pi = 0, ni = 0;
        while (pi < pos.length && ni < neg.length) {
            result[i++] = pos[pi++];
            result[i++] = neg[ni++];
        }

        return result;
    }
    public static void main(String[] args){
        int nums[]={3,1,-2,-5,2,-4};
        rearrangeArray(nums);
    }
        
    }
