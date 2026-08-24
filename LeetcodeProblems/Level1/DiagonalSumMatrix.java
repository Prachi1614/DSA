public class DiagonalSumMatrix {

    public static int diagonalSum(int [][]matrix){
        int sum = 0;
        for(int i = 0; i < matrix.length; i++){
            sum += matrix[i][1];

            if(i != matrix.length - 1 - i){
                sum += matrix[i][matrix.length - 1 - i];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int matrix[][] = {{1 , 1 , 1 , 1},
                          {1 , 1 , 1 , 1},
                          {1 , 1 , 1 , 1},
                          {1 , 1 , 1 , 1}};
        System.out.println(diagonalSum(matrix));
    }
}
