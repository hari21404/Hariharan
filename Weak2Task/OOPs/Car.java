package Weak2Task.OOPs;

public class Car {
    private String make;
    private String model;
    private int year;

    Car(String make,String model,int year)
    {
        this.make=make;
        this.model=model;
        this.year=year;
    }

    public int getYear() {
        return year;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void startEngine()
    {
        System.out.println(model+"  engine has started");
    }

    public static void main(String[] args) {
        Car car = new Car("Toyota", "Corolla", 2022);
        System.out.println("Model:"+ car.getModel());
        System.out.println("Make:"+car.make);
        System.out.println("year:"+car.year);
        car.startEngine();
    }
}
