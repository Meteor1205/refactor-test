package demo4;

public class NorwegianBlueParrot extends Bird {
    public NorwegianBlueParrot(Bird bird) {
        super(bird);
    }

    @Override
    public String plumage() {
        return (this.getVoltage() > 100) ? "scorched" : "beautiful";
    }
}
