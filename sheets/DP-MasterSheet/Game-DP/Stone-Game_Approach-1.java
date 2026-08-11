class Solution {
    int[][]dp= new int[501][501];
    public boolean stoneGame(int[] piles) {
        for(int d[] : dp) Arrays.fill(d,-1);
        return help(piles,0,piles.length-1)>0;
    }
    int help(int[] piles,int i, int j){
        if(i>j) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        return dp[i][j]=Math.max(piles[i]-help(piles,i+1,j),piles[j]-help(piles,i,j-1));
    }
}