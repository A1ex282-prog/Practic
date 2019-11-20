package Chspter_4;

public class Vehicle {
    int passengers;     //кол-во пассажиров
    int fuelcap;        //емкость бака
    int mpg;            //потребленик топлива в милях на галон

    Vehicle(int p, int f, int m){

        passengers = p;
        fuelcap =f;
        mpg = m;
    }

    // Расчет дальности поездки
    int range () {

        return mpg * fuelcap;
    }

    //Расчет кол-ва топлева для заданной поездки
    double fuelNeeded (int miles) {

        return (double) miles / mpg;
    }
}
class TwoVehicle {
    public static void main (String main[]){
        Vehicle minivan = new Vehicle(7, 16, 21);
        Vehicle sportcar = new Vehicle( 2, 14, 12);

        int range1, range2, dist;
        double gallons;

        //Присвоить значение полям в обхекте minivan
//        minivan.passengers = 7;
//        minivan.fuelcap = 16;
//        minivan.mpg =21;

        //Присвоить значение полям в обхекте sportcar
//        sportcar.passengers = 2;
//        sportcar.fuelcap = 14;
//        sportcar.mpg = 12;

        //Расчитать дальность поездки при полном баке
        range1 = minivan.range();
        range2 = sportcar.range();

        System.out.println("Минивен может перевести " + minivan.passengers +
                " пассажиров на расстояние " + minivan.range());
        System.out.println("Для преодоления " + minivan.range() + " миль нужно " +
                sportcar.fuelNeeded(minivan.range()) + " галонов топлива\n");
        System.out.println("Спорткар может перевести " + sportcar.passengers +
                " пассажиров на расстояние " + sportcar.range());
        System.out.println("Для преодоления " + sportcar.range() + " миль нужно " +
                sportcar.fuelNeeded(sportcar.range()) + " галонов топлива");



    }
}
