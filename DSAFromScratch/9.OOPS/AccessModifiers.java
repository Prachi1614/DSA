public class AccessModifiers {
    public static void main(String[] args) {
        BankAccount myacc = new BankAccount();
        myacc.Username = "Prachi@123";
        myacc.changepassword("alpha234");

        System.out.println(myacc.Username);
    }
}

//There are total 4 acces modifiers and those are 
/*
1. Private - its only accessible to its class and functions.
2. Default - its used when none of them are set , its accessible to class and package.
3. Protected - its accessible to class package and outside package by subclass only
4. Public - Its accessible to all of class, package , out the package to the subclass
and also outside the package. 
 */

class BankAccount{
    public String Username;
    private String Password;

    void changepassword(String pwd){
        Password = pwd;
    }
}


