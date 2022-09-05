package TypesOfTransport.AirTransport;

import TypesOfDrivingForce.Fuel;
import TypesOfPrivacy.Public;

public class PassengerPlane extends AirTransport implements Fuel, Public {
    @Override
    public void buyATicket() {
        System.out.println("Вы купили билет на самолет.");
    }
}
