package TypesOfTransport.WaterTransport.PublicWaterTransport;

import TypesOfDrivingForce.Fuel;

public class CruiseShip extends PublicWaterTransport implements Fuel {

    @Override
    public void buyATicket() {
        System.out.println("Вы купили билет на круизный лайнер.");
    }
}
