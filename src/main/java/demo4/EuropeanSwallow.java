package demo4;

public class EuropeanSwallow extends Bird {
    public EuropeanSwallow(Bird bird) {
        super(bird);
    }

    @Override
    public String plumage() {
        return "average";
    }

    @Override
    public Integer airSpeedVelocity() {
        return 35;
    }
}
