class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        int[] dp= new int[n+1];
        dp[0]=cost[0];
        dp[1]=cost[1];
        if(n==2) return Math.min(dp[0],dp[1]);
        for(int i=2; i<n+1; i++){
            dp[i]=cost[i-1]+Math.min(dp[i-1],dp[i-2]);
        }
        return dp[n];
    }
}