package InstanceOfExample;

public class Main {
    public static void main(String[] args) {


        Vehicle[] vehicles = new Vehicle[] {new Car(), new Car(), new Track()};

        for (Vehicle vehicle : vehicles) {
            vehicle.drive();
            if (vehicle instanceof Car car) {
                //((InstanceOfExample.Car) vehicle).playMusic();
                car.playMusic();
            }
        }

        System.out.println("vehicles.length = " + vehicles.length);

    }
}