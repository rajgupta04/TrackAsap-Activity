class Solution {
    static int[][]dp = new int[101][101];
    static int matrixMultiplication(int arr[]) {
        // code here
        int n= arr.length;
        for(int[] d : dp) Arrays.fill(d,-1);
        return mcm(arr,1,n-1);
        
    }
    static int mcm(int[]arr,int i, int j){
        if(i>=j) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        int min= Integer.MAX_VALUE;
        for(int k=i; k<=j-1; k++){
            int temp= mcm(arr,i,k) + mcm(arr,k+1,j) + arr[i-1] * arr[k] * arr[j];
            min=Math.min(min,temp);
        }
        return dp[i][j]= min;
    }
}