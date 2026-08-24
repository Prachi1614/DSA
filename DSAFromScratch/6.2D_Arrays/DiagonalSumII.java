public class DiagonalSumII {

    public static int diagonalBruteForce(int matrix[][]){
        int n = matrix.length;
        int m = matrix[0].length;
        
        int sum = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
               if(i == j){
                sum += matrix[i][j];
               }
               else if(i + j == n - 1){
                sum += matrix[i][j];
               }
            }
        }
        return sum;
    }

    public static int optimizedSum(int matrix[][]){
        int sum = 0;

        for(int i = 0; i < matrix.length; i++){
            sum += matrix[i][i];

            if(i != matrix.length - i - 1){
                sum += matrix[i][matrix.length - i - 1];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int matrix[][] = {{1 , 2 , 3 , 4},
                          {5 , 6 , 7 , 8},
                          {9 , 10 , 11 , 12},
                          {13 , 14 , 15 , 16}};
        // System.out.println(diagonalBruteForce(matrix));
        System.out.println(optimizedSum(matrix));
    }
}
