class Pair{
    int i;
    int j;
    Pair(int i,int j){
        this.i=i;
        this.j=j;
    }
}
class Solution {
    public int orangesRotting(int[][] grid) {
        int m= grid.length;
        int n= grid[0].length;
        Queue<Pair> q= new LinkedList<>();
        boolean[][] visited= new boolean[m][n];
        int fresh=0;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j]==2){
                     q.add(new Pair(i,j));
                     visited[i][j]=true;
                }
                if(grid[i][j]==1) fresh++;
            }
        }
        if(fresh==0) return 0;
        int s=0;
        int[][] dir= {{0,1},{1,0},{-1,0},{0,-1}};
        while(!q.isEmpty()){
            int size= q.size();
            while(size-->0){
                Pair curr= q.poll();
                for(int[] d : dir){
                    int ni=curr.i + d[0];
                    int nj=curr.j + d[1];
                    if(ni < 0 || ni>=m ||nj <0 || nj>=n || visited[ni][nj] || grid[ni][nj]==0)
                    continue;
                    q.add(new Pair(ni,nj));
                    visited[ni][nj]=true;
                    grid[ni][nj]= 2;
                }
            }
            s++;
        }
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j]==1) return -1;
            }
        }
        return s-1;
    }
}