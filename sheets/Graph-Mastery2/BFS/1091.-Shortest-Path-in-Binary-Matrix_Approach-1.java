class Pair{
    int i;
    int j;
    Pair(int i, int j){
        this.i=i;
        this.j=j;
    }
}
class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int m= grid.length;
        int n= grid[0].length;
        int[][] dir = {{0,1},{0,-1},{-1,0},{1,0},{-1,-1},{1,1},{-1,1},{1,-1}};
        if(grid[0][0]==1 || grid[m-1][n-1]==1) 
            return -1;
        int c=1;
        boolean[][] visited= new boolean[m][n];
        Queue<Pair> q= new LinkedList<>();
        q.add(new Pair(0,0));
        visited[0][0]=true;
        while(!q.isEmpty()){
            int size= q.size();
            while(size-->0){
                Pair curr= q.poll();
                if(curr.i==m-1 && curr.j==n-1) return c;
                for(int[] d : dir){
                    int ni=curr.i+d[0];
                    int nj=curr.j+d[1];
                    if(ni<0 || ni>=m || nj<0 || nj>=n || visited[ni][nj] 
                        || grid[ni][nj]==1) continue;
                    q.add(new Pair(ni,nj));
                    visited[ni][nj]=true;
                }
            }
            c++;
        }

    return -1;
    }
}