public class CastDemo {
    public static void main (String args[]){
        double x,y;
        byte b;
        int i;
        char ch;

        x = 10.0;
        y = 3.0;
        i = (int) (x/y);
        System.out.println("x/y = " + i);
        i = 100;
        b = (byte) i;
        System.out.println("b = " + b);
        b = 90;
        ch = (char) b;
        System.out.println("ch = " + ch);
    }
}
