import java.io.IOException;

public class kbIn {
    public static void main (String args[]) throws IOException {

            int num;
            System.out.print ("Введите число: ");
            num = (int) System.in.read();
            System.out.println("Вы ввели" + num);


    }

}
