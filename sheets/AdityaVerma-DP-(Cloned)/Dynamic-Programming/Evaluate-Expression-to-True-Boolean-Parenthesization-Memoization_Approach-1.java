class Solution {
    static int[][][]dp= new int[101][101][2];
    static int countWays(String s) {
        // code here
        int n=s.length();
        for(int[][] a : dp){
            for(int[] b : a) Arrays.fill(b,-1);
        }
        return solve(s,0,n-1,true);
    }
    static int solve(String s, int i, int j,boolean curr){
       
        if(i>j) return 0;
        if(i==j) return (curr==(s.charAt(i)=='T')) ? 1 : 0 ;
        if(curr==true && dp[i][j][1]!=-1) return dp[i][j][1];
        if(curr==false && dp[i][j][0]!=-1) return dp[i][j][0];
        int lt;
        int lf;
        int rt;
        int rf;
        int ans=0;
        for(int k=i+1; k<j; k+=2){
            lt=solve(s,i,k-1,true);
            lf=solve(s,i,k-1,false);
            rt=solve(s,k+1,j,true);
            rf=solve(s,k+1,j,false);
        
        if(s.charAt(k)=='&'){
            if(curr==true){
                ans+=(lt*rt);
            }else{
                ans+=(lt*rf+lf*rt+lf*rf);
            }
        }else if(s.charAt(k)=='|'){
            if(curr==true){
                ans+=(lt*rt + rt*lf + rf*lt);
            }else{
                ans+=(lf*rf);
            }
        }else if(s.charAt(k)=='^'){
            if(curr==true){
                ans+=(lt*rf + lf*rt);
            }else{
                ans+=(lt*rt + lf*rf);
        }
        }
    }
    int p= (curr==true) ? 1: 0;
        return dp[i][j][p]=ans;
}
}