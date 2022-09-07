package TypesOfTransport.LandTransport.PrivateLandTransport;

import TypesOfDrivingForce.MuscularForce;

public class Wagon extends PrivateLandTransport implements MuscularForce {

    Wagon() {
        setCountOfWheels(4);
        setHasWheels(true);
    }

    @Override
    public void takeARide() {
        System.out.println("Для использования телеги возьмите лошадь.");
    }
}
