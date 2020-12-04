import java.util.concurrent.BlockingQueue;

public interface Vehicle<T> {
    float checkFuelCapacity();
    void go();
    float getFuel();
    float getFuelConsumption();
    String getName();
    float getTankCapacity();
    void setFuel(float fuel);
}
