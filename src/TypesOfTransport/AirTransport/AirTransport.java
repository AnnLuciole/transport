package TypesOfTransport.AirTransport;

public class AirTransport {

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

    public void getTypeOfEnvirnomentOfMovement() {
        System.out.println("Транспорт передвигается по воздуху.");
    }
}