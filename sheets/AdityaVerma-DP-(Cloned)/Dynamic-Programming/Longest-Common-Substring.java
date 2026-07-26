class Solution {
    int[][] dp;
    int max=0;
    public int longCommSubstr(String s1, String s2) {
        // code here
        int m=s1.length();
        int n=s2.length();
        dp= new int[m+1][n+1];
        for(int d[] : dp) Arrays.fill(d,-1);
        int c= lcsub(s1,s2,m,n);
        return max;
    }
    int lcsub(String s1, String s2,int m, int n){
        if(m==0 || n==0) return 0;
        int curr=0;
        if(dp[m][n]!=-1) return dp[m][n];
        if(s1.charAt(m-1) == s2.charAt(n-1)) {
        dp[m][n]= curr = 1 + lcsub(s1,s2,m-1,n-1);
         max=Math.max(max,curr);
        }else{
            dp[m][n]=0;
        }
         lcsub(s1,s2,m,n-1);
         lcsub(s1,s2,m-1,n);
         return curr;
    }
}