package TypesOfEnvirnomentOfMovement;

public interface Driveable {

    default void getTypeOfEnvirnomentOfMovement() {
        System.out.println("Транспорт передвигается по земле.");
    }
}
