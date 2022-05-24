import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

public abstract class VehicleQueue {
    protected BlockingQueue<Vehicle> queue = new LinkedBlockingDeque<>();
}
