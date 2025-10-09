class Solution {
    public static int[] searchRange(int[] nums, int target) {
        int first = findFirst(nums, target);
        int last = findLast(nums, target);
        return new int[]{first, last};
        
    }
    public static int findFirst(int nums[], int target){
        int start = 0;                  
        int end = nums.length - 1; 
        int index=-1;   
        while (start <= end) {
            int mid = start + (end - start) / 2;  
            if (nums[mid] == target) {
                index=mid;
                end=mid-1; 
            } 
            else if (nums[mid] < target) {
                start = mid + 1;  
            } 
            else {
                end = mid - 1; 
            }
        }

        return index;
    }
    public static int findLast(int nums[], int target){
        int start = 0;                  
        int end = nums.length - 1; 
        int index=-1;   
        while (start <= end) {
            int mid = start + (end - start) / 2;  
            if (nums[mid] == target) {
                index=mid;
                start=mid+1;  
            } 
            else if (nums[mid] < target) {
                start = mid + 1;  
            } 
            else {
                end = mid - 1; 
            }
        }

        return index;
    }
    public static void main(String[] args){
        int nums[]={5,7,7,8,8,10};
        int target=8;
        searchRange(nums,target);
        
    }
}