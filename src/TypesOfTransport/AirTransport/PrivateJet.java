package TypesOfTransport.AirTransport;

import TypesOfDrivingForce.Fuel;
import TypesOfPrivacy.Private;

public class PrivateJet extends AirTransport implements Fuel, Private {
    @Override
    public void buyATicket() {
        System.out.println("Вы не можете купить билет на этот самолет.");
    }
}
