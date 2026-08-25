import java.util.*;

public class SpiralMatrix {

    public static List<Integer> printSpiral(int arr[][]) {
        List<Integer> ans = new ArrayList<>();
        int startRow = 0;
        int startCol = 0;
        int endRow = arr.length - 1;
        int endCol = arr[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {
            for (int j = startCol; j <= endCol; j++) {
                ans.add(arr[startRow][j]);
            }

            for (int i = startRow + 1; i <= endRow; i++) {
                ans.add(arr[i][endCol]);
            }

            for (int j = endCol - 1; j >= startCol; j--) {
                if (startRow == endRow) {
                    break;
                }
                ans.add(arr[endRow][j]);
            }

            for (int i = endRow - 1; i >= startRow + 1; i--) {
                if (startCol == endCol) {
                    break;
                }
                ans.add(arr[i][startCol]);
            }
            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[][] = {{1 , 2 , 3 , 4},
                       {5 , 6 , 7 , 8},
                       {9 , 10 , 11 , 12},
                       {13 , 14 , 15 , 16}};
                    System.out.println(printSpiral(arr));
    }
}
