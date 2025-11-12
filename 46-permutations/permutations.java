class Solution {
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), nums, new boolean[nums.length]);
        return result;
    }

    public static void backtrack(List<List<Integer>> result, List<Integer> tempList, int[] nums, boolean[] used) {
        if (tempList.size() == nums.length) {
            result.add(new ArrayList<>(tempList));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (used[i]) continue; 
            used[i] = true;
            tempList.add(nums[i]);
            backtrack(result, tempList, nums, used);
            tempList.remove(tempList.size() - 1);
            used[i] = false; 
        }
        
    }
    public static void main(String[] args){
        int nums[]={1,2,3};
        permute(nums);
    }
}