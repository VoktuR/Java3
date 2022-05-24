import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class GasPool {
    protected float gasPoolCapacity = 200f;
    private ReadWriteLock lock = new ReentrantReadWriteLock();

    public void requestFuel(float fuelAmount) {
        lock.writeLock().lock();

        gasPoolCapacity -= fuelAmount;

        lock.writeLock().unlock();
    }

    public void info() {
        lock.readLock().lock();

        System.out.println("There is " + gasPoolCapacity + " left in pool");

        lock.readLock().unlock();
    }
}