class Solution {
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result= new ArrayList<>();
        int n= nums.length;
        int total=1<<n;
        for(int i=0;i<total;i++){
            List<Integer> subset=new ArrayList<>();
            for(int j=0;j<n;j++){
                if((i&(1<<j))!=0){
                    subset.add(nums[j]);

                }
            }
            result.add(subset);
        }
        return result;
        
    }
    public static void main(String[] args){
        int nums[]={1,2,3};
        List<List<Integer>> subsets=subsets(nums);
        System.out.println(subsets);
    }
}