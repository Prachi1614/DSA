public class BinarySearchIn2DMatrix {

    public static boolean searchInMatrix(int arr[][] , int tar){
        int row = 0;
        int col = arr.length - 1;

        while(row < arr.length && col >= 0){
            if(arr[row][col] == tar){
                System.out.println("Key Found at :" + "(" + row + "," + col + ")");
                return true;
            }
            else if(tar < arr[row][col]){
                col--;
            }
            else{
                row++;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[][] = {{10 , 20 , 30 , 40},
                       {15 , 25 , 35 , 45},
                       {27 , 29 , 37 , 48},
                       {32 , 33 , 39 , 50}};
                       System.out.println(searchInMatrix(arr, 50));
    }
}
