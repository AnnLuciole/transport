package TypesOfEnvirnomentOfMovement;

public interface Swimmable extends TypesOfEnvirnomentOfMovement {

    @Override
    default void getTypeOfEnvirnomentOfMovement() {
        System.out.println("Транспорт передвигается по воде");
    }

}
