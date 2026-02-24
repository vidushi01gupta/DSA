class Solution {
    public static String minWindow(String s, String t) {
        if(s.length()<t.length() || t.length()==0){
            return "";
        }
        int freq[]=new int[128];
        for(char c : t.toCharArray()){
            freq[c]++;

        }
        int left=0;
        int right=0;
        int minlen=Integer.MAX_VALUE;
        int req=t.length();
        int start=0;
        while(right<s.length()){
            char r =s.charAt(right);
            if(freq[r]>0){
                req--;
            }
            freq[r]--;
            right++;

            while(req==0){
            if(right-left<minlen){
                minlen=right-left;
                start=left;
            }
            char l =s.charAt(left);
            freq[l]++;
            if(freq[l]>0){
                req++;
            }
            left++;

        }
        
        } 
        return minlen==Integer.MAX_VALUE?"":s.substring(start,start+minlen);
    }
}