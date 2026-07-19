class Solution {
    static int perfectSum(int[] arr, int target) {
        // code here
        int n= arr.length;
        int[][] dp = new int[n+1][target+1];
        // for(int i=0; i<n+1; i++) dp[i][0]=1;
        dp[0][0]=1;
        // int mod=1000000007;
        for(int i=1; i<n+1; i++){
            for(int j=0; j<target+1; j++){
                if(j>=arr[i-1]) dp[i][j]= (dp[i-1][j-arr[i-1]]+dp[i-1][j]);
                else dp[i][j]=dp[i-1][j];
            }
        }
        // for(int i=0; i<n+1; i++) System.out.println(dp[i][0]);
        return dp[n][target];
    }
}