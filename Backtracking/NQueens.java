class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans=new ArrayList<>();
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }
        solve(0,board,ans,n);
        return ans;
    }
    public void solve(int col,char[][] board,List<List<String>> ans,int n){
        if(col==n){
            saveBoard(board,ans);
            return;
        }
        for(int row=0;row<n;row++){
            if(isSafe(row,col,board)){
                board[row][col]='Q';
                solve(col+1,board,ans,n);
                board[row][col]='.';
            }
        }
    }
    public boolean isSafe(int row,int col,char[][] board){
        //horizontal
        for(int j=0;j<board.length;j++){
            if(board[row][j]=='Q'){
                return false;
            }
        }
        //vertical
        for(int i=0;i<board.length;i++){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        //upperLeft
        int r=row;
        for(int c=col;c>=0 && r>=0;r--,c--){
            if(board[r][c]=='Q'){
                return false;
            }
        }
        //upperRight
        r=row;
        for(int c=col;c<board.length && r>=0;r--,c++){
            if(board[r][c]=='Q'){
                return false;
            }
        }
        //lowerLeft
        r=row;
        for(int c=col; r<board.length  && c>=0;r++,c--){
            if(board[r][c]=='Q'){
                return false;
            }
        }
        //lowerRight
        r=row;
        for(int c=col;c<board.length && r<board.length ;c++,r++){
            if(board[r][c]=='Q'){
                return false;
            }
        }
        return true;
    }
    public void saveBoard(char[][] board, List<List<String>> ans){
        String row="";
        List<String> nBoard=new ArrayList<>();
        for(int i=0;i<board.length;i++){
            row="";
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]=='Q'){
                    row+='Q';
                }
                else{
                    row+='.';
                }
            }
            nBoard.add(row);
        }
        ans.add(nBoard);
    }
}
