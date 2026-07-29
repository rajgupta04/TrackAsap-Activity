class Solution {
    int[][] dp;
    int max=0;
    public int longCommSubstr(String s1, String s2) {
        // code here
        int m=s1.length();
        int n=s2.length();
        dp= new int[m+1][n+1];
        int max=0;
        for(int i=1; i<m+1; i++){
            for(int j=1; j<n+1; j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)) dp[i][j]= 1+ dp[i-1][j-1];
                else dp[i][j]=0;
                max=Math.max(dp[i][j],max);
            }
        }
        return max;
    }
    
}