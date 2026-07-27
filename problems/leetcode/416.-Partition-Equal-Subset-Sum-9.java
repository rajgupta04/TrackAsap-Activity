class Solution {
    public boolean canPartition(int[] nums) {
        int n = nums.length;
        int s=0;
        for(int num : nums) s+=num;
        if(s%2!=0) return false;
        boolean[][] dp =new boolean[n+1][s/2+1];
        for(int i=0; i<n+1; i++) dp[i][0]=true;
        for(int i=1; i<n+1; i++){
            for(int j=1; j<s/2+1; j++){
                if(j>=nums[i-1])
                dp[i][j]= dp[i][j-nums[i-1]] || dp[i-1][j];
                else dp[i][j]= dp[i-1][j];
            }
        }
        return dp[n][s/2];
    }
}