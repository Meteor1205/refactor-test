package demo4;

public class Bird {
    private String name;
    private String type;
    private int numberOfCoconut;
    private int voltage;
    private boolean isNailed;

    public Bird(String name, String type, int numberOfCoconut, int voltage, boolean isNailed) {
        this.name = name;
        this.type = type;
        this.numberOfCoconut = numberOfCoconut;
        this.voltage = voltage;
        this.isNailed = isNailed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNumberOfCoconut() {
        return numberOfCoconut;
    }

    public void setNumberOfCoconut(int numberOfCoconut) {
        this.numberOfCoconut = numberOfCoconut;
    }

    public int getVoltage() {
        return voltage;
    }

    public void setVoltage(int voltage) {
        this.voltage = voltage;
    }

    public boolean isNailed() {
        return isNailed;
    }

    public void setNailed(boolean nailed) {
        isNailed = nailed;
    }
}
