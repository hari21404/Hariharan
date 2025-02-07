package Weak2Task.OOPs;

public class ElectricCar extends Car{
    private int batteryRange;

    ElectricCar(String make, String model, int year, int batteryRange)
    {
        super(make,model,year);
        this.batteryRange=batteryRange;

    }

    public void setBatteryRange(int batteryRange) {
        this.batteryRange = batteryRange;
    }

    public int getBatteryRange() {
        return batteryRange;
    }

    public void chargeBattery() {
        System.out.println("The battery is being charged.");
    }

    public static void main(String[] args) {
        ElectricCar eCar = new ElectricCar("Tesla", "Model S", 2023, 400);
        System.out.println(eCar.getMake());
        System.out.println(eCar.getModel());
        System.out.println(eCar.getYear());
        System.out.println("Battery range: " + eCar.getBatteryRange() + " miles");

        eCar.startEngine();
        eCar.chargeBattery();
    }
}
