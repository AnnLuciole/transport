package TypesOfTransport.AirTransport;

import TypesOfEnvirnomentOfMovement.Flyable;
import TypesOfTransport.Transport;

public abstract class AirTransport extends Transport implements Flyable {

    private int countOfPlaces;

    public int getCountOfPlaces() {
        return countOfPlaces;
    }

    public void setCountOfPlaces(int countOfPlaces) {
        if (countOfPlaces > 0) {
            this.countOfPlaces = countOfPlaces;
        }
        System.out.println("Введено некорректное количество мест.");
    }

}
