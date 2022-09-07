package TypesOfTransport.LandTransport;

import TypesOfEnvirnomentOfMovement.Driveable;
import TypesOfTransport.Transport;

public abstract class LandTransport extends Transport implements Driveable {
    private int countOfWheels;
    private boolean hasWheels;

    public int getCountOfWheels() {
        return countOfWheels;
    }

    public boolean isHasWheels() {
        return hasWheels;
    }

    public void setCountOfWheels(int countOfWheels) {
        if (countOfWheels >= 0) {
            this.countOfWheels = countOfWheels;
        }
        System.out.println("Вы ввели неверное количество колес. Повторите попытку.");
    }

    public void setHasWheels(boolean hasWheels) {
        this.hasWheels = hasWheels;
    }
}
