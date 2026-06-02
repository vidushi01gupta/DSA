class Solution {
    public static int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int ans = Integer.MAX_VALUE;
        int n = landStartTime.length;
        int m = waterStartTime.length;

        for (int i = 0; i < n; i++) {
            int landFinish = landStartTime[i] + landDuration[i];
            for (int j = 0; j < m; j++) {
                int startWater = Math.max(landFinish, waterStartTime[j]);
                ans = Math.min(ans, startWater + waterDuration[j]);
            }
        }
        for (int i = 0; i < m; i++) {
            int waterFinish = waterStartTime[i] + waterDuration[i];
            for (int j = 0; j < n; j++) {
                int startLand = Math.max(waterFinish, landStartTime[j]);
                ans = Math.min(ans, startLand + landDuration[j]);
            }
        }

        return ans;

    }
}