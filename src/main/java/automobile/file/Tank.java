package main.java.automobile.file;

public class Tank {
    private int liters;

    public int getLiters() {
        return liters;
    }

    public void setLiters(int liters) {
        this.liters = liters;
    }

    @Override
    public String toString() {
        return "Tank{" +
                "liters=" + liters +
                '}';
    }
}
