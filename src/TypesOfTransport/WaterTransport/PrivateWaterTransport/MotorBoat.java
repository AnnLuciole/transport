package TypesOfTransport.WaterTransport.PrivateWaterTransport;

import TypesOfDrivingForce.Fuel;

public class MotorBoat extends PrivateWaterTransport implements Fuel {

    @Override
    public void takeARide() {
        System.out.println("Приятной поездки на моторной лодке.");
    }
}
