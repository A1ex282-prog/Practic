package Chspter_4;

public class Vehicle {
    int passengers;     //кол-во пассажиров
    int fuelcap;        //емкость бака
    int mpg;            //потребленик топлива в милях на галон
}
class TwoVehicle {
    public static void main (String main[]){
        Vehicle minivan = new Vehicle();
        Vehicle sportcar = new Vehicle();

        int range1, range2;

        //Присвоить значение полям в обхекте minivan
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg =21;

        //Присвоить значение полям в обхекте sportcar
        sportcar.passengers = 2;
        sportcar.fuelcap = 14;
        sportcar.mpg = 12;

        //Расчитать дальность поездки при полном баке
        range1 = minivan.fuelcap * minivan.mpg;
        range2 = sportcar.fuelcap * sportcar.mpg;

        System.out.println("Минивен может перевести " + minivan.passengers +
                " пассажиров на расстояние "+ range1 + " миль.");
        System.out.println("Спорткар может перевести " + sportcar.passengers +
                " пассажиров на расстояние "+ range2 + " миль.");



    }
}
