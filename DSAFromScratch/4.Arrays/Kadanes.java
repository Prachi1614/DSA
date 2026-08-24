public class Kadanes {

    public static void kadanes(int numbers[]) {
        int max = Integer.MIN_VALUE;
        int cs = 0;

        boolean allneg = true;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                allneg = false;
                break;
            }
            max = Math.max(max, numbers[i]);
        }

        if (allneg) {
            System.out.println("The Max sum is : " + max);
            return;
        }

        for (int i = 0; i < numbers.length; i++) {
            cs = cs + numbers[i];
            if (cs < 0) {
                cs = 0;
            }
            max = Math.max(max, cs);
        }
        System.out.print("The Value of MaxSum is : " + max);
    }

    public static void optimizedKadane(int numbers[]){
        int max = Integer.MIN_VALUE;
        int cs = 0;

        for(int i = 0; i < numbers.length; i++){
            cs = Math.max(numbers[i], cs+numbers[i]);
          
            max = Math.max(max, cs);
        }
        System.out.print("The Value of MaxSum is : " + max);
    }

    public static void main(String[] args) {
        int numbers[] = {-2 , -3 , 4 , -1 , -2 , 1 , 5 , -3 };
        // kadanes(numbers);
        optimizedKadane(numbers);
    }
}
