class Solution {
    static int[][] dp;
    static int lcs(String s1, String s2) {
        // code here
        int m= s1.length();
        int n= s2.length();
        dp= new int[m+1][n+1];
        // for(int[] d : dp) Arrays.fill(d,-1);
        // return getlcs(s1,s2,m,n);
        //first row and column will be zero as 0 matches none!!
        for(int i=1; i<m+1; i++){
            for(int j=1; j<n+1; j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)) dp[i][j]= 1+ dp[i-1][j-1];
                else dp[i][j]= Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
        return dp[m][n];
        
    }
    // static int getlcs(String s1, String s2, int m, int n){
    //     if(m==0  || n==0) return 0;
    //     if(dp[m][n]!=-1) return dp[m][n];
    //     if(s1.charAt(m-1)==s2.charAt(n-1)){
    //         return dp[m][n]= (1 + getlcs(s1,s2,m-1,n-1));
    //     }
    //     else{
    //         return dp[m][n]=Math.max(getlcs(s1,s2,m-1,n) , getlcs(s1,s2,m,n-1));
    //     }
    // }
}