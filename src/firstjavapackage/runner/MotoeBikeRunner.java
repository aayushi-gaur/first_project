package firstjavapackage.runner;

import firstjavapackage.MotorBike;

public class MotoeBikeRunner {
    public static void main (String[] args) {
        MotorBike ducati = new MotorBike();
        MotorBike honda = new MotorBike();

        ducati.start();
        honda.start();

        ducati.setSpeed(100);
        System.out.println(ducati.getSpeed());

        //honda.setSpeed(80);
        System.out.println(honda.getSpeed());

        /*ducati.setSpeed(10);
        System.out.println(ducati.getSpeed());

        honda.setSpeed(0);
        System.out.println(honda.getSpeed());
        */

    }
}
