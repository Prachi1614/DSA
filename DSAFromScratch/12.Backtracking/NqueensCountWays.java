public class NqueensCountWays {

    public static boolean isSafe(char board[][], int row, int col) {
        // For verticle up
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }
        // For diagonal left
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }

        }
        // For diagonal right
        for (int i = row - 1 , j = col + 1; i >= 0 && j < board.length; i-- , j++) {
            if(board[i][j] == 'Q'){
               return false;
            } 
        }
        return true;
    }

    public static void countWays(char board[][], int row) {
        if (row == board.length) {
            count++;
            return;
        }
        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';
                countWays(board, row + 1);
                board[row][j] = 'x';
            }
        }
    }

    public static void printarr(char board[][]){
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board.length; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    static int count = 0;
    public static void main(String[] args) {
        int n = 7;
        char board[][] = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'x';
            }
        }
        countWays(board, 0);
        System.out.println(count);
    }
}
