import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class Main {

    public static void main(String[] args) {
        Road road = new Road();
        GasStation gasStation = new GasStation();
        ExecutorService executorService = Executors.newFixedThreadPool(7);
        executorService.submit(new Car("Car_1", road, gasStation));
        executorService.submit(new Car("Car_2", road, gasStation));
        executorService.submit(new Car("Car_3", road, gasStation));
        executorService.submit(new Car("Car_4", road, gasStation));
        executorService.submit(new Car("Car_5", road, gasStation));
        executorService.submit(new Car("Car_6", road, gasStation));
        executorService.submit(new Car("Car_7", road, gasStation));
   //     executorService.submit(new Truck("Truck_1", road, gasStation));
    //    executorService.submit(new Truck("Truck_1", road, gasStation));
   //     executorService.submit(new Bus("Bus_1", road, gasStation));
        executorService.shutdown();
    }
}
