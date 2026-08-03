class Solution {
    static int[][] dp= new int[1001][1001];
    static int palPartition(String s) {
        // code here
        int n=s.length();
        for(int[] d : dp) Arrays.fill(d,-1);
        return solve(s,0,n-1);
        
    }
    static int solve(String s,int i, int j){
        if(i>=j) return 0;
        if(isPalindrome(s,i,j)) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        int min=Integer.MAX_VALUE;
        // System.out.println("Reached!!");
        for(int k=i; k<j; k++){
            int left=0;
            int right=0;
            if(dp[i][k]!=-1) left=dp[i][k];
            else left=solve(s,i,k);
            if(dp[k+1][j]!=-1) right=dp[k+1][j];
            else right= solve(s,k+1,j);
            int temp=left+right+1;
            min=Math.min(min,temp);
        }
        return dp[i][j]=min;
    }
    static boolean isPalindrome(String s,int i,int j){
        if(i==j) return true;
        if(i>j) return true;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}