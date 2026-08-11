class Solution {
    int[]dp;
    int help(int[] stoneValue,int start,int n){
        if(start>=n) return 0;
        if(dp[start]!=-1) return dp[start];
        int s=0;
        int ans= Integer.MIN_VALUE;
        for(int i=0; i<3; i++){
            if(i+start<n) s+=stoneValue[i+start];
            ans=Math.max(ans,s-help(stoneValue,start+i+1,n));
        }
        return dp[start]=ans;
    }
    
    
    public String stoneGameIII(int[] stoneValue) {
        int n=stoneValue.length;
        dp=new int[n+1];
        int s=0;
        Arrays.fill(dp,-1);
        for(int val : stoneValue) s+=val;
        int diff=help(stoneValue,0,n);
        if(diff==0) return "Tie";
        else if(diff<0) return "Bob";
        else return "Alice";
    }
}