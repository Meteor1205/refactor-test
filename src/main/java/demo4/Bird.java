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

    public String plumage() {
        switch (this.getType()) {
            case "EuropeanSwallow":
                return "average";
            case "AfricanSwallow":
                return (this.getNumberOfCoconut() > 2) ? "tired" : "average";
            case "NorwegianBlueParrot":
                return (this.getVoltage() > 100) ? "scorched" : "beautiful";
            default:
                return "unknown";
        }
    }

    public Integer airSpeedVelocity() {
        switch (this.getType()) {
            case "EuropeanSwallow":
                return 35;
            case "AfricanSwallow":
                return 40 - 2 * this.getNumberOfCoconut();
            case "NorwegianBlueParrot":
                return (this.isNailed()) ? 0 : 10 + this.getVoltage() / 10;
            default:
                return null;
        }
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
