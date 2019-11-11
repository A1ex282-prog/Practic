package Tasck;

public class Tasck_1_2 {
    public static void main (String args[]){
        double metr, inch;
        int count = 0;
        for (inch = 1;inch < 51; inch++){
            metr = inch * 2.54;
            System.out.println(inch + " дюймов равен " + metr + " сантиметров");
            count++;
            if(count == 12){
                System.out.println();
                count=0;
            }
        }
    }
}
