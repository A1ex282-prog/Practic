public class SqrRoot {
    public static void main(String args[]){
        double num, sroot, rerr;
        for(num = 1.0;num > -100.0; num-=10){
            sroot = Math.sqrt(num);
            System.out.println("Корено квадрата из " + num + " равен: " + sroot);
            // Вычислить ошибку округлени
            rerr = num - (sroot * sroot);
            System.out.println("Ошибка округления " + rerr + "\n");
        }


    }
}
