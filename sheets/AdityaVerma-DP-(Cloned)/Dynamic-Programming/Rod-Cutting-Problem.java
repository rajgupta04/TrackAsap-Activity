class Solution {
    public int cutRod(int[] price) {
        // code here
        int n=price.length;
        int[][] dp= new int[n+1][n+1]; // n as let's say weight and another n as the length of val arr
        for(int i=1; i<n+1; i++){
            for(int j=1; j<n+1; j++){
                //let's say here we have j means if i cut the rod 
                if(j>=i){
                    dp[i][j]=Math.max(price[i-1]+dp[i][j-i],dp[i-1][j]);
                }else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[n][n];
    }
}