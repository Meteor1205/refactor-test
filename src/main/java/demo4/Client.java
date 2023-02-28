package demo4;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Client {
    public static void main(String[] args) {
        List<Bird> birds = List.of(
                BirdFactory.createBird(new Bird("EuropeanSwallow_A", "EuropeanSwallow", 1, 50, false)),
                BirdFactory.createBird(new Bird("AfricanSwallow_A", "AfricanSwallow", 3, 50, true)),
                BirdFactory.createBird(new Bird("AfricanSwallow_B", "AfricanSwallow", 1, 50, false)),
                BirdFactory.createBird(new Bird("NorwegianBlueParrot_A", "NorwegianBlueParrot", 1, 50, false)),
                BirdFactory.createBird(new Bird("NorwegianBlueParrot_B", "NorwegianBlueParrot", 1, 101, true))
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
        return bird.plumage();
    }

    public static Map<String, Integer> speeds(List<Bird> birds) {
        return birds.stream().collect(Collectors.toMap(Bird::getName, Client::airSpeedVelocity));
    }

    public static Integer airSpeedVelocity(Bird bird) {
        return bird.airSpeedVelocity();
    }
}
