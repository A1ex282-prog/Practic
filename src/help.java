import java.io.IOException;

public class help {
    public static void main (String args[]) throws IOException {
        char ignore;


            System.out.println("Справка :");
            System.out.println("1. if");
            System.out.println("2. switch");
            System.out.println("2. for");
            System.out.println("2. while");
            System.out.println("2. do-while\n");
            System.out.print("Выберите: ");

        char select = (char) System.in.read();

        switch (select) {
            case '1':
                System.out.println("оператор if:\n");
                System.out.println("if(условие) оператор;");
                System.out.println("else оператор");
                break;
            case '2':
                System.out.println("Оператор switch:\n");
                System.out.println("switch(выражение){");
                System.out.println("    case константа:");
                System.out.println("    последовательность операторов");
                System.out.println("    break;");
                System.out.println("    // ...");
                System.out.println("}");
                break;
            default:
                System.out.println("Запрос не найден");

        }
    }
}
