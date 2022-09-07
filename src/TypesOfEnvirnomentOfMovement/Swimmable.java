package TypesOfEnvirnomentOfMovement;

public interface Swimmable {

    default void getTypeOfEnvirnomentOfMovement() {
        System.out.println("Транспорт передвигается по воде.");
    }
}
