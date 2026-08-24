public class HollowRectangle {
    public static void hollow_Rect(int totrows, int totcols){
        //outer loop for rows
        for(int i = 1 ; i <= totrows; i++){
            //inner loop for cols
            for(int j = 1; j <= totcols; j++){
                //boundary condition cell - (i , j)
                if(i == 1 || i == totrows || j == 1 || j == totcols){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }
    public static void main(String[] args) {
        hollow_Rect(8, 3);
    }
}
