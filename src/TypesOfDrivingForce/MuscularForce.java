package TypesOfDrivingForce;

public interface MuscularForce {
    default void getTypeOfDrivingForce() {
        System.out.println("Данный транспорт движется посредством мускульной силы.");
    }
}
