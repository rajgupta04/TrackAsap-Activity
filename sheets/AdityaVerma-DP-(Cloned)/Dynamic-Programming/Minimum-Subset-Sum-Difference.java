class Solution {
    public int minDifference(int arr[]) {
        // code here
        int n=arr.length;
        int sum=0;
        for(int num : arr) sum+=num;
        boolean[][]dp = new boolean[n+1][sum+1];
        for(int i=0; i<n+1; i++) dp[i][0]=true;
        for(int i=1; i<n+1; i++){
            for(int j=1; j<sum+1; j++){
                if(j>=arr[i-1]){
                    dp[i][j]=dp[i-1][j-arr[i-1]] || dp[i-1][j];
                }else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        int min=Integer.MAX_VALUE;
        for(int j=0; j<=sum/2; j++){
            if(dp[n][j]) min=Math.min(min,sum-j-j);
        }
        return min;
    }
}
