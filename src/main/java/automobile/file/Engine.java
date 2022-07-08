package main.java.automobile.file;

public class Engine {
    private double engineVolume;
    private int quantityOfCylinders;

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public int getQuantityOfCylinders() {
        return quantityOfCylinders;
    }

    public void setQuantityOfCylinders(int quantityOfCylinders) {
        this.quantityOfCylinders = quantityOfCylinders;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "engineVolume=" + engineVolume +
                ", quantityOfCylinders=" + quantityOfCylinders +
                '}';
    }
}


