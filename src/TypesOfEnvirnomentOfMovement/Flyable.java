package TypesOfEnvirnomentOfMovement;

public interface Flyable {

    default void getTypeOfEnvirnomentOfMovement() {
        System.out.println("Транспорт передвигается по воздуху.");
    }
}
