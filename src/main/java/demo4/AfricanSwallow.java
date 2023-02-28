package demo4;

public class AfricanSwallow extends Bird {
    public AfricanSwallow(Bird bird) {
        super(bird);
    }

    @Override
    public String plumage() {
        return (this.getNumberOfCoconut() > 2) ? "tired" : "average";
    }
}
