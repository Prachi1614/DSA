public class Largest {

    public static int largestNum(int number[] ){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < number.length; i++){
            if(largest < number[i]){
                largest = number[i];
            }
        }
        for(int i = 0; i < number.length; i++){
            if(smallest > number[i]){
                smallest = number[i];
            }
        }
        System.out.println("The smallest number is:" + smallest);
        return largest;
    }
    public static void main(String[] args) {
        int number [] = {1,2,3,4,5,688,7,8,9,10};
        System.out.println("The largest number is:" + largestNum(number));
    }
}
