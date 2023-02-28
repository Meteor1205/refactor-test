package demo4;

public class BirdFactory {
    public static Bird createBird(Bird bird) {
        switch (bird.getType()) {
            case "EuropeanSwallow":
                return new EuropeanSwallow(bird);
            case "AfricanSwallow":
                return new AfricanSwallow(bird);
            case "NorwegianBlueParrot":
                return new NorwegianBlueParrot(bird);
            default:
                return new Bird(bird);
        }
    }
}
