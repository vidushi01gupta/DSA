class Solution {
    public static int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int landfirst=solve(landStartTime,landDuration,waterStartTime,waterDuration);
        int waterfirst=solve(waterStartTime,waterDuration,landStartTime,landDuration);

        return Math.min(landfirst,waterfirst);
    }

    public static int solve(int start1[], int dur1[], int start2[], int dur2[]){
        int minEnd=Integer.MAX_VALUE;
        for (int i = 0; i < start1.length; i++) {
            minEnd = Math.min(minEnd, start1[i] + dur1[i]);
        }
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < start2.length; i++) {
            int finish = Math.max(minEnd, start2[i]) + dur2[i];
            ans = Math.min(ans, finish);
        }

        return ans;
    }
}