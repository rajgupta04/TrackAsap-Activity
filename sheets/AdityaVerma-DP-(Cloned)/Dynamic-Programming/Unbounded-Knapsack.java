class Solution {
    int[][] dp;
    public int knapSack(int val[], int wt[], int capacity) {
        // code here
        int n=val.length;
        //tabulaton in first attempt done under 5 min !!
        // int[][] dp= new int[n+1][capacity+1];
        // for(int i=1; i<n+1; i++){
        //     for(int j=1; j<capacity+1; j++){
        //         if(j>=wt[i-1]){
        //             dp[i][j]=Math.max(val[i-1]+dp[i][j-wt[i-1]],dp[i-1][j]);
        //         }
        //         else dp[i][j]=dp[i-1][j];
        //     }
        // }
        // return dp[n][capacity];
        dp= new int[n+1][capacity+1];
        for(int [] arr : dp) Arrays.fill(arr,-1);
        return solve(val,wt,capacity,n);
    }
    int solve(int[] val, int[] wt, int capacity, int n){
        
        if(n==0 || capacity==0) return 0;
        if(dp[n][capacity]!=-1) return dp[n][capacity];
        
        if(capacity >= wt[n-1]){
            return dp[n][capacity]=Math.max((val[n-1]+solve(val,wt,capacity-wt[n-1],n)),solve(val,wt,capacity,n-1));
        }else 
        return dp[n][capacity]=solve(val,wt,capacity,n-1);
    }
    
}