import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class Car extends VehicleQueue implements Vehicle, Runnable {

    private Road road;
    private GasStation gasStation;
    private float tankCapacity = 20;
    private float fuel = 20;
    private float fuelConsumption = 2.5f;
    private String name;

    public Car(String name, Road road, GasStation gasStation) {
        this.name = name;
        this.road = road;
        this.gasStation = gasStation;
    }

    public float checkFuelCapacity() {
        return fuel -= fuelConsumption;
    }

    public void go() {
        road.drive(this);
        while (gasStation.gasPoolCapacity >= tankCapacity) {
            queue.add(this);
            gasStation.refuel(queue.peek());
            road.drive(queue.poll());
        }
        System.out.println("There is not enough fuel. " + name + " has finished moving");
    }

    @Override
    public float getFuel() {
        return fuel;
    }

    @Override
    public float getFuelConsumption() {
        return fuelConsumption;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public float getTankCapacity() {
        return tankCapacity;
    }

    @Override
    public void setFuel(float fuel) {
        this.fuel = fuel;
    }

    @Override
    public void run() {
        this.go();
    }

}
