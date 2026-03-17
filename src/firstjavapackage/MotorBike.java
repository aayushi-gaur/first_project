package firstjavapackage;

public class MotorBike {

    //state
    //instance variable
    private int speed = 0; //member variable


    //behavior
    public void start() {
        System.out.println("Bike started");
    }

    public void setSpeed(int speed) {//local variable
        if (speed > 0) {
            this.speed = speed;
        }
    }

    public int getSpeed() {//local variable
        return speed;
    }

    public void increaseSpeed(int howMuch) {

        this.speed = this.speed + howMuch;
    }

    public void decreaseSpeed(int howMuch) {

        setSpeed(this.speed - howMuch);
    }

    //Constructor
    //no need for a return type
    //name same as name of class

    public MotorBike(int speed) {

        this.speed = speed;
    }

    public MotorBike () {
        this(5); //calling the above constructor
    }
}
