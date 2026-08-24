public class CopyConstructors {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Prachi";
        s1.roll = 123;
        s1.Password = "Prachi1403";
        s1.marks[0] = 100;
        s1.marks[1] = 80;
        s1.marks[2] = 90;

        Student s2 = new Student(s1);
        s2.Password = "xyz";
        s1.marks[2] = 50;

        System.out.println(s2.name);
        System.out.println(s2.Password);
        for(int i = 0; i < 3; i++){
            System.out.println(s2.marks[i]);
        }
    }
}
class Student{
    String name;
    int roll;
    String Password;
    int marks[];

    //Shallow copy constructor
    // Student(Student s1){
    //     marks = new int[3];
    //     this.name = s1.name;
    //     this.roll = s1.roll;
    //     this.marks = s1.marks;
    // }

    //Deep copy constructor  -- This will not change the value of marks in s2.
     Student(Student s1){
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        for(int i = 0; i < marks.length; i++){
            this.marks[i] = s1.marks[i];
        }
    }


    Student(){
       marks = new int[3];
    }
}
