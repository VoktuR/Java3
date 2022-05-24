import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.Semaphore;

public class GasStation extends GasPool {
    private Semaphore semaphore;

    public GasStation() {
        this(3);
    }
    public GasStation(int permits) {
        this(new Semaphore(permits));
    }
    public GasStation(Semaphore semaphore) {
        this.semaphore = semaphore;
    }

    public void refuel(Vehicle vehicle) {
        try {
            semaphore.acquire();
            System.out.println(vehicle.getName() + " is fueling");
            requestFuel(vehicle.getTankCapacity() - vehicle.getFuel());
            vehicle.setFuel(vehicle.getTankCapacity());
            info();
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            System.out.println(vehicle.getName() + " ready to go");
            semaphore.release();
        }
    }

}
