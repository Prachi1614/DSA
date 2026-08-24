public class OOPS{
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.changeColor("blue");

        p1.color = "yellow";

        System.out.println(p1.color);

        Student s1 = new Student();
        s1.totalPercent(20, 30, 40);

        System.out.println(s1.percentage);
    }
    
}

class Pen{
    String color;
    int tip;

    void changeColor(String newColor){
        color = newColor;
    }

    void setTip(int newTip){
        tip = newTip;
    }
}

class Student{
    String name;
    int age;
    float percentage;

    void totalPercent(int phy , int chem , int maths){
        percentage = (phy + chem + maths) / 3; 
    }
}