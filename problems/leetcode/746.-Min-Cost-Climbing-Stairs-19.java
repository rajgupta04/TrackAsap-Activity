class Solution {
    public int minCostClimbingStairs(int[] cost) {
       int c=0;
       int n=cost.length;
       int i=(cost[0]<cost[1])? 0 :1;
       while(i<n-1){
        int step=(cost[i]<cost[i]+1) ? 1 : 2;
        i+=step;
        c++;
       }
       return c;
        
    }
}