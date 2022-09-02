package TypesOfDrivingForce;

public interface Steam {
    default void getTypeOfDrivingForce() {
        System.out.println("Данный транспорт является паровым.");
    }
}
