package main.java.automobile.file;

public class Automobile {
    private String brand;
    private Engine engine;
    private Wheels wheels;
    private Tank tank;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Wheels getWheels() {
        return wheels;
    }

    public void setWheels(Wheels wheels) {
        this.wheels = wheels;
    }

    public Tank getTank() {
        return tank;
    }

    public void setTank(Tank tank) {
        this.tank = tank;
    }

    @Override
    public String toString() {
        return "Automobile{" +
                "brand='" + brand + '\'' +
                ", engine=" + engine +
                ", wheels=" + wheels +
                ", tank=" + tank +
                '}';
    }
}

