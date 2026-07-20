class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int n= nums.length;
        int sum=0;
        for(int num : nums) sum+=num;
        //diff == target
        //sum+diff to counter .decimal
        if(sum<target || sum+target <0 || (sum+target)%2!=0) return 0;
        // let's assume all negative in one subset and positive in one subset
        //problem reduces to count subsetsum with given diff
        // s1-s2=diff ------1
        //s1+s2=sum --------2
        //add
        //2*s1 = diff+sum 
        //s1 = (diff+sum) / 2;
        int subset2= (target+sum)/2;
        int[][] dp= new int[n+1][subset2+1];
        dp[0][0]=1;
        for(int i=1; i<n+1; i++){
            for(int j=0; j<subset2+1; j++){
                if(j>=nums[i-1]) dp[i][j]= dp[i-1][j-nums[i-1]] + dp[i-1][j];
                else dp[i][j]=dp[i-1][j];
            }
        }
        return dp[n][subset2];
        

    }
}