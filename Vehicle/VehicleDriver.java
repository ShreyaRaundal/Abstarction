package Vehicle;

public class VehicleDriver {
    public static void main(String[] args) {
        Vehicle myCar=new Car();
        Vehicle myBike=new Bike();

        myCar.move();
        myBike.move();

    }
}
