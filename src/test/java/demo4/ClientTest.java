package demo4;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class ClientTest {

    List<Bird> birds = List.of(
            BirdFactory.createBird(new Bird("EuropeanSwallow_A", "EuropeanSwallow", 1, 50, false)),
            BirdFactory.createBird(new Bird("AfricanSwallow_A", "AfricanSwallow", 3, 50, true)),
            BirdFactory.createBird(new Bird("AfricanSwallow_B", "AfricanSwallow", 1, 50, false)),
            BirdFactory.createBird(new Bird("NorwegianBlueParrot_A", "NorwegianBlueParrot", 1, 50, false)),
            BirdFactory.createBird(new Bird("NorwegianBlueParrot_B", "NorwegianBlueParrot", 1, 101, true))
    );

    @Test
    void plumages() {
        Map<String, String> result = Client.plumages(birds);

        Map<String, String> expected = Map.of(
                "EuropeanSwallow_A", "average",
                "NorwegianBlueParrot_A", "beautiful",
                "NorwegianBlueParrot_B", "scorched",
                "AfricanSwallow_A", "tired",
                "AfricanSwallow_B", "average"
        );

        assertEquals(expected, result);
    }

    @Test
    void speeds() {
        Map<String, Integer> result = Client.speeds(birds);

        Map<String, Integer> expected = Map.of(
                "EuropeanSwallow_A", 35,
                "NorwegianBlueParrot_A", 15,
                "NorwegianBlueParrot_B", 0,
                "AfricanSwallow_A", 34,
                "AfricanSwallow_B", 38
        );

        assertEquals(expected, result);
    }
}