package TypesOfEnvirnomentOfMovement;

public interface Drivable extends TypesOfEnvirnomentOfMovement {

    @Override
    default void getTypeOfEnvirnomentOfMovement() {
        System.out.println("Транспорт передвигается по суше.");
    }
}
