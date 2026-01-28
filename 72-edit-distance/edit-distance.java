class Solution {
    static int dp[][];
    public static int minDistance(String word1, String word2) {
        int m=word1.length();
        int n=word2.length();
        dp=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                dp[i][j]=-1;
            }
        }
        return helper(word1,word2,m-1,n-1);
        
    }
    public static int helper(String w1,String w2,int i,int j){
        if(i<0){
            return j+1;
        }
        if(j<0){
            return i+1;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        if(w1.charAt(i)==w2.charAt(j)){
            dp[i][j]=helper(w1,w2,i-1,j-1);
        }
        else{
            int insert=helper(w1,w2,i,j-1);
            int delete=helper(w1,w2,i-1,j);
            int replace=helper(w1,w2,i-1,j-1);

            dp[i][j]=1+Math.min(insert,Math.min(delete,replace));
        }
        return dp[i][j];

    }
}