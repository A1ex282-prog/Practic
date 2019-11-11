public class GalToLit {
    public static void main (String args[]){
        double gallons = 10;
        double liters = gallons * 3.7854;
        int a, b, c;
        a = 2;
        b = 3;
        System.out.println(gallons + "галлонам соответствует " + liters + "литров");

        if(a < b) System.out.println("a меньше b");
        if (a == b) System.out.println("Null");
        System.out.println();

        c = a - b;
        System.out.println("c содержит -1");
        if (c >= 0) System.out.println("c не отрецательное");
        if (c <= 0) System.out.println("с отрицатьное");
        System.out.println();

        c = b - a;
        System.out.println("с содержит 1");
        if (c >= 0) System.out.println("с не отрицательный");
        if (c <= 0) System.out.println("с отрицательное");

    }
}
