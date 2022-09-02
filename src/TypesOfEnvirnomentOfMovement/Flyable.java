package TypesOfEnvirnomentOfMovement;

public interface Flyable extends TypesOfEnvirnomentOfMovement {

    @Override
    default void getTypeOfEnvirnomentOfMovement() {
        System.out.println("Транспорт передвигается по воздуху.");
    }
}
