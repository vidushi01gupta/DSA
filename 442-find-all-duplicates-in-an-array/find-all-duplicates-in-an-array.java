class Solution {
    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> result=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for (int key : map.keySet()) {
        if (map.get(key) == 2) {
            result.add(key);
        }
    }

    return result;
        
    }
}