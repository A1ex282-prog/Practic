public class GalToLitTable {
    public static void main (String args[]){
        double liters;
        int gallons;
        int counter = 0;
        for (gallons = 1; gallons <= 10; gallons++){
            liters = gallons * 3.7854;
            System.out.println(gallons + " галлонам соответствует "+liters + " литров");
            counter++;
            if (counter ==5){
                System.out.println();
                counter = 0;
            }
        }
    }
}
