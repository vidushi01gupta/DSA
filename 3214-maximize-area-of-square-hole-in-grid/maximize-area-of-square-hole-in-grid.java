class Solution {
    public static int maximizeSquareHoleArea(int n, int m, int[] hBars, int[] vBars) {
        int maxH = longestConsecutive(hBars);
        int maxV = longestConsecutive(vBars);
        int side = Math.min(maxH, maxV) + 1;
        return side * side;
    }

    public static int longestConsecutive(int[] arr) {
        Arrays.sort(arr);
        int maxLen = 1;
        int currLen = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1] + 1) {
                currLen++;
            } 
            else {
                currLen = 1;
            }
            maxLen = Math.max(maxLen, currLen);
        }

        return maxLen;
    }
}