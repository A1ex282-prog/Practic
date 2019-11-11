public class First {
    public static void main (String args []){
        for(int i = 0; i<3; ++i) {
            System.out.println("Java правит миром" + i);
        }
        System.out.println();
        int var1 = 1024;
        int var2 = var1 / 2;
        int var = 10;
        double x = 10.0;
        System.out.println("Начальное заначеник var "+var);
        System.out.println("начальное значение x "+x);
        System.out.println();
        var = var / 4;
        x = x / 4;
        System.out.println("Значеник var после деления "+var);
        System.out.println("Значение x после деления "+x);
        System.out.println();
        System.out.println("Переменная var1 содержит "+var1);
        System.out.print("Переменная var2 содержит ");
        System.out.println(var2);
    }
}
