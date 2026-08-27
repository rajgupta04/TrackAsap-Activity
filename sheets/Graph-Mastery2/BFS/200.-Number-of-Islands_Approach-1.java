class Solution {
    int[][] dir={{0,1},{0,-1},{-1,0},{1,0}};
    public int numIslands(char[][] grid) {
        int m= grid.length;
        int n= grid[0].length;
        int c=0;

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j]=='1'){
                    explore(grid,i,j,m,n);
                    c++;
                }
            }
        }
        return c;
    }
    void explore(char[][] grid, int i, int j,int m,int n){
        if(i<0 || i>=m || j<0 || j>=n || grid[i][j]=='0') return;
        grid[i][j]='0';
        for(int[] d : dir){
        explore(grid,i+d[0],j+d[1],m,n);
        }
        
    }
}