class Solution {
    public static long countOperationsToEmptyArray(int[] nums) {
        int n=nums.length;
        int arr[][]=new int[n][2];
        for(int i=0;i<n;i++){
            arr[i][0]=nums[i];
            arr[i][1]=i;
        }
        Arrays.sort(arr,(a,b)-> { if(a[0]!=b[0]) return a[0]-b[0];
        return a[1]-b[1];
        });
        long operation=n;
        for(int i=1;i<n;i++){
            if(arr[i][1] < arr[i-1][1]){
                operation+= (n-i);
            }
        }
        return operation;
    }
}