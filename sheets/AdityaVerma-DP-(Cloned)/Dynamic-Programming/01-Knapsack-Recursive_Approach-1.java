class Solution {
    // int[][] dp= new int[1001][1001];
    int[][] dp;
    public int knapsack(int W, int val[], int wt[]) {
        // code here
        int n=val.length;
        this.dp= new int[W+1][n+1];
        for(int[] t : dp){
            Arrays.fill(t,-1);
        }
        return knapsack01(W,val,wt,n);
        
        
    }
    int knapsack01(int W, int val[] , int wt[] , int n){
        if(W==0 || n==0) return 0;
        if(dp[W][n]!=-1) return dp[W][n];
        if(wt[n-1]<=W){
            return dp[W][n]= Math.max(val[n-1]+knapsack01(W-wt[n-1],val,wt,n-1),knapsack01(W,val,wt,n-1));
        }
            return  dp[W][n]=knapsack01(W,val,wt,n-1);
        
    }
}
