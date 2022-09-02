package TypesOfEnvirnomentOfMovement;

public interface Drivable {

    default void getTypeOfEnvirnomentOfMovement() {
        System.out.println("Транспорт передвигается по суше.");
    }
}
