package demo4;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Client {
    public static void main(String[] args) {
        List<Bird> birds = List.of(
                new Bird("EuropeanSwallow_A", "EuropeanSwallow", 1, 50, false),
                new Bird("AfricanSwallow_A", "AfricanSwallow", 3, 50, true),
                new Bird("AfricanSwallow_B", "AfricanSwallow", 1, 50, false),
                new Bird("NorwegianBlueParrot_A", "NorwegianBlueParrot", 1, 50, false),
                new Bird("NorwegianBlueParrot_B", "NorwegianBlueParrot", 1, 101, true)
        );
        Map<String, String> plumages = plumages(birds);
        Map<String, Integer> speeds = speeds(birds);
        System.out.println(plumages);
        System.out.println(speeds);
    }

    public static Map<String, String> plumages(List<Bird> birds) {
        return birds.stream().collect(Collectors.toMap(Bird::getName, Client::plumage));
    }

    public static String plumage(Bird bird) {
        switch (bird.getType()) {
            case "EuropeanSwallow":
                return "average";
            case "AfricanSwallow":
                return (bird.getNumberOfCoconut() > 2) ? "tired" : "average";
            case "NorwegianBlueParrot":
                return (bird.getVoltage() > 100) ? "scorched" : "beautiful";
            default:
                return "unknown";
        }
    }

    public static Map<String, Integer> speeds(List<Bird> birds) {
        return birds.stream().collect(Collectors.toMap(Bird::getName, Client::airSpeedVelocity));
    }

    public static Integer airSpeedVelocity(Bird bird) {
        switch (bird.getType()) {
            case "EuropeanSwallow":
                return 35;
            case "AfricanSwallow":
                return 40 - 2 * bird.getNumberOfCoconut();
            case "NorwegianBlueParrot":
                return (bird.isNailed()) ? 0 : 10 + bird.getVoltage() / 10;
            default:
                return null;
        }
    }
}
