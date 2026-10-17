class Solution {
    public static int minSwaps(int[] nums) {
        int n=nums.length;
        Integer[] indices = new Integer[n];
        for (int i = 0; i < n; i++) {
            indices[i] = i;
        }
        Arrays.sort(indices, (a, b) -> {
            int sumA = digitsum(nums[a]);
            int sumB = digitsum(nums[b]);
            if (sumA != sumB) {
                return Integer.compare(sumA, sumB);
            }
            return Integer.compare(nums[a], nums[b]);
        });

        boolean[] visited = new boolean[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (visited[i] || indices[i] == i) {
                continue;
            }
            int cycleSize = 0;
            int j = i;
            while (!visited[j]) {
                visited[j] = true;
                j = indices[j];
                cycleSize++;
            }
            count += cycleSize - 1;
        }
        return count;
        
    }
    public static int digitsum(int n){
        int sum=0;
        while(n>0){
            int digit=n%10;
            sum+=digit;
            n/=10;
        }
        return sum;

    }
}