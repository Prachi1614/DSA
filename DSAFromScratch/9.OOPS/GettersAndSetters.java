public class GettersAndSetters {
    public static void main(String[] args) {
        Pen p2 = new Pen();
        p2.setColor("yellow");
        System.out.println(p2.getColor());
        
        p2.setTip(3);
        System.out.println(p2.getTip());
    } 
}

class Pen{
    private String color;
    private int Tip;

    String getColor(){
        return this.color;
    }

    int getTip(){
        return this.Tip;
    }

    void setColor(String newcolor){
        this.color = newcolor;
    }

    void setTip(int newTip){
        this.Tip = newTip;
    }
}
