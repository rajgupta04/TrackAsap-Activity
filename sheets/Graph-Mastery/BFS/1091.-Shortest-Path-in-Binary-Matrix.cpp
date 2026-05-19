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
        
        if(grid[0][0]==1) return -1;
        if(m==1 && n==1 && grid[0][0]==0) return 1;
        boolean[][]visited= new boolean[m][n];
        Queue<Pair> q= new LinkedList<>();
        int[][] dirs={{-1,0},{1,0},{0,1},{0,-1},{-1,-1},{-1,1},{1,-1},{1,1}};
        q.offer(new Pair(0,0));
        visited[0][0]=true;
        int pathsize=1;
        while(!q.isEmpty()){
            int size=q.size();
            while(size-->0){
            Pair curr= q.poll();
            int curri=curr.i;
            int currj=curr.j;
            for(int[] dir: dirs){
                int nexti=curr.i+dir[0];
                int nextj=curr.j+dir[1];
                if(nexti<0 || nexti >=m || nextj < 0 || nextj >=n || visited[nexti][nextj] || grid[nexti][nextj]==1) continue;
                if(nexti==m-1 && nextj==n-1) return pathsize+1;
                q.offer(new Pair(nexti,nextj));
                visited[nexti][nextj]=true;
            }
        }
            pathsize++;
        }
        return -1;
    }
}