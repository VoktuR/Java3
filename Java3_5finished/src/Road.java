public class Road {

    public void drive(Vehicle vehicle) {
        while (vehicle.getFuel() >= vehicle.getFuelConsumption()) {
            System.out.println(vehicle.getName() + " is moving");
            try {
                // Тут 3 секнуды должно быть, просто только так видно что они в очереди за бензином стоят
                Thread.sleep(1000 + (int) (Math.random() * 2000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(vehicle.getName() + " has " + vehicle.checkFuelCapacity() + " for finish the road");
        }
        System.out.println(vehicle.getName() + " is stopped");
    }

}
