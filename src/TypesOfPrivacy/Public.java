package TypesOfPrivacy;

public interface Public extends TypesOfPrivacy {

    default void getTypeOfPrivacy() {
        System.out.println("Данный транспорт является общественным.");
    }

    void buyATicket();
}
