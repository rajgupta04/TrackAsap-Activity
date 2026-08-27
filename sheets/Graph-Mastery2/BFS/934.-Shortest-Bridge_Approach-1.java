class Pair{
    int i;
    int j;
    Pair(int i, int j){
        this.i=i;
        this.j=j;
    }
}
class Solution {
    boolean[][] visited;
    int[][]dir={{0,1},{1,0},{-1,0},{0,-1}};
    Queue<Pair>q = new LinkedList<>();
    public int shortestBridge(int[][] grid) {
        int m= grid.length;
        int n=grid[0].length;
        visited= new boolean[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j]==1){
                    explore(grid,i,j,m,n);
                    return solve(grid);
                }
            }
        }
        return -1;
    }
    public int solve(int[][]grid){
        int c=0;
        int m=grid.length;
        int n= grid[0].length;
        while(!q.isEmpty()){
            int size= q.size();
            while(size-->0){
                Pair curr= q.poll();
                for(int[] d : dir){
                    int ni=curr.i+d[0];
                    int nj=curr.j+d[1];
                    if(ni<0 || ni>=m || nj<0 || nj >=n || visited[ni][nj]) continue;
                    if(grid[ni][nj]==1) return c;
                    q.add(new Pair(ni,nj));
                    visited[ni][nj]=true;
                }
            }
            c++;
        }
        return -1;
    }
    public void explore(int[][]grid,int i, int j, int m, int n){
        if(i<0 || i>=m || j<0 || j>=n ||visited[i][j] || grid[i][j]==0) return;
        q.add(new Pair(i,j));
        visited[i][j]=true;
        for(int[] d : dir){
            explore(grid,i+d[0],j+d[1],m,n);
        }
    }
}