package printRecursion;

public class printNQueens {
    public static void main(String[] args) {
        getQueens(new boolean[4][4] , 0, "");
    }

    private static void getQueens(boolean[][] board, int row, String result) {
        if (row == board.length){
            System.out.println(result);
            return;
        }
        int count = 0;
        for (int col =0 ; col < board[row].length; col++){
            if (isItSafe(board, row, col)){
                board[row][col] = true;
                getQueens(board, row+1, result+"{"+(row+1)+ ","+(col+1)+"}");
                board[row][col] = false;
            }

        }
    }

    private static boolean isItSafe(boolean[][] board, int row, int col) {
        for( int i = row; i>= 0; i--){
            if(board[i][col]){
                return false;
            }
        }
        for( int i = row,j=col; i>= 0&&j>=0; i--,j--){
            if(board[i][j]){
                return false;
            }}
        for( int i = row,j=col; i>= 0&&j<board.length; i--,j++){
            if(board[i][j]){
                return false;
            }
        }
        return true;
    }

}

