class Solution {
    public boolean exists(char[][] board, int i,int j,char[] word,int ind){
        if(i<0 || i>=board.length || j<0 || j>=board[0].length ||board[i][j]=='.'|| board[i][j]!=word[ind] ) return false;
        if(ind==word.length-1) return true;
        char ch=board[i][j];
        board[i][j]='.';

            boolean res=exists(board,i+1,j,word,ind+1)|| exists(board,i-1,j,word,ind+1) || exists(board,i,j+1,word,ind+1)||exists(board,i,j-1,word,ind+1);
        board[i][j]=ch;
        return res;
    }
    public boolean exist(char[][] board, String word) {
        char[] wordArray=word.toCharArray();
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==wordArray[0] && exists(board,i,j,wordArray,0)){
                    return true;
                }
            }
        }
        return false;
    }
}
