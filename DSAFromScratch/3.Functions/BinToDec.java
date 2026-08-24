public class BinToDec {

    public static void binToDec(int binnum){
        int Mynum = binnum;
        int power = 0;
        int decimal = 0;

        while(binnum > 0){
            int lastD = binnum % 10;
            decimal = decimal + (lastD *(int)(Math.pow(2 , power)));
             
            power++;
            binnum = binnum / 10;
        }
        System.out.println("The Decimal conversion of Binary number " + Mynum + " is : " + decimal);

    }
    public static void main(String[] args) {
        binToDec(101);
    }
}
