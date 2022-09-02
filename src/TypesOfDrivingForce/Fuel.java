package TypesOfDrivingForce;

public interface Fuel {
    default void getTypeOfDrivingForce() {
        System.out.println("Данный транспорт является топливным.");
    }
}
