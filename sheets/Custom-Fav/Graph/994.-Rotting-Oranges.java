class Pair{
    int i;
    int j;
    Pair(int i, int j){
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
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j]==2){
                    q.offer(new Pair(i,j));
                    visited[i][j]=true;
                }
            }
        }
        int[][] dirs={{0,1},{0,-1},{-1,0},{1,0}};
        int noOfMinutes=0;
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0; i<size; i++){
            Pair curr= q.poll();
            int currI= curr.i;
            int currJ=curr.j;
            for(int[] dir : dirs){
                int nextI= currI + dir[0];
                int nextJ= currJ + dir[1];
                if(nextI <0 || nextI>=m || nextJ <0 || nextJ>=n || visited[nextI][nextJ] || grid[nextI][nextJ]==0) continue;
                grid[nextI][nextJ]=2;
                q.offer(new Pair(nextI,nextJ));
                visited[nextI][nextJ]=true;
            } 
            }
            if(!q.isEmpty())
            noOfMinutes++;
        }
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j]==1) return -1;
                // System.out.print(grid[i][j]+" ");
            }
                // System.out.println();
        }
        return noOfMinutes;
    }
}