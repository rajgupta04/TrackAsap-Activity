class Solution {
    static int dp[][] = new int[1001][1001];
    {
        for(int d[] : dp) Arrays.fill(d,-1);
    }
    static int eggDrop(int n, int k) {
        // code here
        
        if(k==0 ||  k==1) return k;
        if(n==1) return k;
        if(dp[n][k]!=-1) return dp[n][k];
        int min= Integer.MAX_VALUE;
        for(int i=1; i<=k; i++){
            int breakk;
            if(dp[n-1][i-1]==-1){
                breakk=eggDrop(n-1,i-1);
            }else{
                breakk=dp[n-1][i-1];
            }
            int nbreakk;
            if(dp[n][k-i]==-1){
                nbreakk=eggDrop(n,k-i);
            }else{
                nbreakk=dp[n][k-i];
            }
            int temp = 1 + Math.max(breakk,nbreakk);
            min= Math.min(min,temp);
        }
        return dp[n][k]=min;
      //that's all
    }
    
}