class Solution {
    public static int minEatingSpeed(int[] piles, int h) {
        int start = 1;                      
        int end = 0;                     
        for (int pile : piles) {
            end = Math.max(end, pile); 
        }

        int result = end;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (canEatAll(piles, mid, h)) {
                result = mid;             
                end = mid - 1;
            } else {
                start = mid + 1;            
            }
        }

        return result;
    

    }

    public static boolean canEatAll(int[] piles, int k, int h) {
    long hours = 0;
    for (int i=0;i<piles.length;i++) {
        hours += (piles[i] + k - 1) / k;  
    }
    return hours <= h;
    }

    public static void main(String[] args){
        int piles[]={3,6,7,11};
        int h=8;
        minEatingSpeed(piles,h);

    }
}
