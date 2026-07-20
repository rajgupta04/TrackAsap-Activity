class Solution {
    public int countPartitions(int[] arr, int diff) {
        // code here
        int n=arr.length;
        int sum=0;
        for(int num : arr) sum+=num;
        // s1-s2=diff ------1
        //s1+s2=sum --------2
        //add
        //2*s1 = diff+sum 
        //s1 = (diff+sum) / 2;
        
        if(diff>sum || (sum+diff) %2!= 0) return 0;
        int subset= (diff+sum)/2;
        int[][]dp=new int[n+1][subset+1];
        dp[0][0]=1;
        for(int i=1; i<n+1; i++){
            for(int j=0; j<subset+1; j++){
                if(j>=arr[i-1]) dp[i][j] = dp[i-1][j-arr[i-1]]+dp[i-1][j];
                else dp[i][j]= dp[i-1][j];
            }
        }
        return dp[n][subset];
    }
}
