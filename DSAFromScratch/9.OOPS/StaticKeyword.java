public class StaticKeyword {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.SchoolName = "JVM";
        
        Student s2 = new Student();
        System.out.println(s2.SchoolName);
        
    }
}

class Student {
    static int result(int phy , int chem , int maths){
        return (phy + chem + maths)/3;
    }
    String name;
    int rollno;

    static String SchoolName;

    void setName(String name){
        this.name = name;
    }
    String getName(){
        return this.name;
    }

    void setRoll(int rollno){
        this.rollno = rollno;
    }
    int getrollno(){
        return this.rollno;
    }
}
