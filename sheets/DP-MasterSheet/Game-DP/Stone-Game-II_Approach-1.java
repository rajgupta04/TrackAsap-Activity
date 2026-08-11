class Solution {
    int[][]dp=new int[101][101];
    int help(int[] pile, int i, int m,int n){
        if(i>=n) return 0;
        if(dp[i][m]!=-1) return dp[i][m];
        int s=0;
        int ans= Integer.MIN_VALUE;
        for(int j=0; j<2*m; j++){
            if(i+j<n) s+=pile[i+j];
            ans=Math.max(ans,s-help(pile,i+j+1,Math.max(m,j+1),n));
        }
        return dp[i][m]=ans;
    }
    public int stoneGameII(int[] piles) {
        int s=0;
        for(int[] d : dp) Arrays.fill(d,-1);
        int n= piles.length;
        for(int num : piles)s+=num;
        int diff= help(piles,0,1,n);
        return (s+diff)/2;
        
    }
}