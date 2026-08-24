public class StringComparison {
    public static void main(String[] args) {
        String s1 = "RONNY";
        String s2 = "RONNY";
        String s3 = new String("RONNY");

        if (s1 == s2) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }
        

        /*In memory the variable is pointing to two diiferent spaces as new keyword is
        used to make new space in the memory.
        */
        
        if (s1 == s3) { //This will give strings are not equal.
            System.out.println("Strings are equal"); 
        } else {
            System.out.println("Strings are not equal");
        }

        //In java string comparison is done with the help of .equals method.

        if(s1.equals(s3)){
            System.out.println("Strings are equal");
        }
        else {
            System.out.println("Strings are not equal");
        }
    }
}
