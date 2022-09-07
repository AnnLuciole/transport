package TypesOfTransport.AirTransport.PublicAirTransport;

import TypesOfDrivingForce.Fuel;
import TypesOfTransport.AirTransport.PublicAirTransport.PublicAirTransport;

public class PassengerPlane extends PublicAirTransport implements Fuel {
    @Override
    public void buyATicket() {
        System.out.println("Вы купили билет на самолет.");
    }
}
