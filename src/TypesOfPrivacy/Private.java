package TypesOfPrivacy;

public interface Private extends TypesOfPrivacy {

    default void getTypeOfPrivacy() {
        System.out.println("Данный транспорт является личным.");
    }

    void takeARide();
}
