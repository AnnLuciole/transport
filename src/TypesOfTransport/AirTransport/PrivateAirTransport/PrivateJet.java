package TypesOfTransport.AirTransport.PrivateAirTransport;

import TypesOfDrivingForce.Fuel;
import TypesOfTransport.AirTransport.PrivateAirTransport.PrivateAirTransport;

public class PrivateJet extends PrivateAirTransport implements Fuel {
    @Override
    public void takeARide() {
        System.out.println("Добро пожаловать на борт частного самолета.");
    }
}
