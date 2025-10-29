class Solution {
    public static int maxDepth(String s) {
        int depth = 0;       
        int maxDepth = 0;  

        for (char c : s.toCharArray()) {
            if (c == '(') {
                depth++;                
                maxDepth = Math.max(maxDepth, depth);  
            } else if (c == ')') {
                depth--;               
            }
        }

        return maxDepth;
    }
    public static void main(String[] args){
        String s="(1+(2*3)+((8)/4))+1";
        maxDepth(s);
    }
}