package TypesOfTransport.WaterTransport.PrivateWaterTransport;

import TypesOfDrivingForce.MuscularForce;

public class Boat extends PrivateWaterTransport implements MuscularForce {

    @Override
    public void takeARide() {
        System.out.println("Приятной поездки на лодке.");
    }
}
