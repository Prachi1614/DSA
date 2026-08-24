public class TypesOfConstructors {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Prachi");
        Student s3 = new Student(123);

        System.out.println(s1);
        System.out.println(s2.name);
        System.out.println(s3.roll);
    }
}


//This is also called as constructor overLoading 
/*
That is making too many constructors inside a class and after making an object the main class
identifies which one to call according to the object is called as constructor overloading
 */
class Student{
    String name;
    int roll;
    int age;

    Student(){
      //Constructor initializing for making more constructors;
    }
    Student(String name){
        this.name = name;
    }
    Student(int roll){
        this.roll = roll;
    }
}
