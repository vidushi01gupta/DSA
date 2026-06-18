class Solution {
    public static double angleClock(int hour, int minutes) {
        double minuteAngle = minutes * 6;
        double hourAngle = (hour % 12) * 30 + minutes * 0.5;
        double diff = Math.abs(hourAngle - minuteAngle);
        return Math.min(diff, 360 - diff);
    }
        
    
}