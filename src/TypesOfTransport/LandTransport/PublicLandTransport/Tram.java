package TypesOfTransport.LandTransport.PublicLandTransport;

import TypesOfDrivingForce.Fuel;

public class Tram extends PublicLandTransport implements Fuel {

    @Override
    public void buyATicket() {
        System.out.println("Вы купили билет на трамвай.");
    }
}
