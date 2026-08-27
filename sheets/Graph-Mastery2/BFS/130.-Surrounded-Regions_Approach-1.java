class Solution {
    boolean[][] visited;
    int[][] dir={{0,1},{0,-1},{1,0},{-1,0}};
    public void solve(char[][] board) {
        int m=board.length;
        int n=board[0].length;
        visited= new boolean[m][n];
        for(int j=0; j<n; j++){
            if(!visited[0][j] && board[0][j]=='O') explore(board,0,j,m,n);
            if(!visited[m-1][j] && board[m-1][j]=='O') explore(board,m-1,j,m,n);
        }
        for(int i=0; i<m; i++){
            if(!visited[i][0] && board[i][0]=='O') explore(board,i,0,m,n);
            if(!visited[i][n-1] && board[i][n-1]=='O') explore(board,i,n-1,m,n);
        }
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(!visited[i][j] && board[i][j]=='O') board[i][j]='X';
            }
        }

    }
    void explore(char[][]board,int i,int j,int m, int n){
        if(i<0 || i>=m || j<0 || j>=n || visited[i][j] || board[i][j]=='X') return;
        // System.out.println("explored at i: "+i+"j: "+j);
        visited[i][j]=true;
        for(int[] d : dir){
            explore(board,i+d[0],j+d[1],m,n);
        }
    }
}