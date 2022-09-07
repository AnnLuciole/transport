package TypesOfTransport.LandTransport.PrivateLandTransport;

import TypesOfDrivingForce.Fuel;

public class Car extends PrivateLandTransport implements Fuel {

    Car() {
        setCountOfWheels(4);
        setHasWheels(true);
    }

    @Override
    public void takeARide() {
        System.out.println("Приятной поездки на авто.");
    }
}
