package Weak2Task.OOPs;

public class Cararray {
    public static void main(String[] args) {
        Car[] cars = new Car[3];
        cars[0] = new Car("Toyota", "Corolla", 2022);
        cars[1] = new ElectricCar("Tesla", "Model S", 2023, 400);
        cars[2] = new Car("Ford", "Mustang", 2021);

        for (Car car : cars)
            car.startEngine();
    }
}
