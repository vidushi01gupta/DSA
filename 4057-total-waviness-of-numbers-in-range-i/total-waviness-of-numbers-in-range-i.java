class Solution {
    public static int totalWaviness(int num1, int num2) {
        int total=0;
        for(int i=num1;i<=num2;i++){
            total+=waviness(i);
        }
        return total;
    }
    public static int waviness(int n){
        String s = String.valueOf(n);
        int count = 0;
        if (s.length() < 3) {
            return 0;
        }
        for (int i = 1; i < s.length() - 1; i++) {
            int prev = s.charAt(i - 1) - '0';
            int curr = s.charAt(i) - '0';
            int next = s.charAt(i + 1) - '0';

            if (curr > prev && curr > next) {
                count++;
            } else if (curr < prev && curr < next) {
                count++; 
            }
        }

        return count;

    }
}