package main.java.automobile.file;

public class Wheels {
    private String wheelsSize;
    private String wheelsRubber;

    public String getWheelsSize() {
        return wheelsSize;
    }

    public void setWheelsSize(String wheelsSize) {
        this.wheelsSize = wheelsSize;
    }

    public String getWheelsRubber() {
        return wheelsRubber;
    }

    public void setWheelsRubber(String wheelsRubber) {
        this.wheelsRubber = wheelsRubber;
    }

    @Override
    public String toString() {
        return "Wheels{" +
                "wheelsSize='" + wheelsSize + '\'' +
                ", wheelsRubber='" + wheelsRubber + '\'' +
                '}';
    }
}
