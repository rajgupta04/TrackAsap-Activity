class Solution {
    static boolean equalPartition(int arr[]) {
        // code here
        int n= arr.length;
        int s=0;
        for(int num : arr) s+=num;
        if(s%2!=0) return false;
        else return check(arr,s/2);
    }
    static boolean check(int arr[] , int sum){
        int n= arr.length;
        boolean[][] dp = new boolean[n+1][sum+1];
        for(int i=0; i<n+1; i++){
            dp[i][0]=true;
        }
        for(int i=1; i<n+1; i++){
            for(int j=1; j<sum+1; j++){
                if(j>=arr[i-1]) dp[i][j]= dp[i-1][j-arr[i-1]] || dp[i-1][j];
                else dp[i][j]= dp[i-1][j];
            }
        }
        return dp[n][sum];
    }
}