public class Hypot {
    public static void main (String args[]){
        double x, y, z;
        char ch;
        x = 3;
        y = 4;
        z = Math.sqrt(x * x + y * y);
        ch ='X';
        System.out.println("Дилнна гипотенузы = " + z);
        System.out.println();
        System.out.println("ch содержит " + ch);
        ch++;
        System.out.println("теперь " + ch);
        ch = 90;
        System.out.println("а вот теперт " + ch);
    }
}
