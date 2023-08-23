package sec02.exam02;

import java.util.Random;

public class DriverExample {

    public static void main(String[] args) {
        // Driver driver = new Driver();
        //
        // Bus bus = new Bus();
        // Taxi taxi = new Taxi();
        //
        // driver.drive(bus);
        // driver.drive(taxi);

        // ✅✅객체 배열을 이용한 다향성 구현

        Vehicle[] v = new Vehicle[5];
//        v[0] = new Bus();
//        v[1] = new Taxi();
//        v[2] = new Taxi();
//        v[3] = new Bus();
//        v[4] = new Taxi();

        Random rnd = new Random();
        for(int i=0; i<v.length; i++) {
            int rndNum = rnd.nextInt(2);
            if(rndNum ==0) {
                v[i] = new Bus();
            } else if(rndNum == 1) {
                v[i] = new Texi();
            }
        }

        //드라이브 호출 시 객체가 어떤것을 참조하고 있는지 확인
        Driver drv = new Driver();
        for (int i = 0; i < v.length; i++) {
            drv.drive(v[i]);
        }
        ;
    }

}