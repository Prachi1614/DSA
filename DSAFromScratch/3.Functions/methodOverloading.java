public class methodOverloading {
    public static int sum(int a , int b){      // Two functions with same name but with different parameters.
        return a+b;
    }

    public static int sum(int a , int b , int c){   // Two functions with same name but with different parameters.
        return a+b+c;
    }
    public static void main(String[] args) {
      System.out.println(sum(3,5,6));
      System.out.println(sum(4,2));  
    }
}
