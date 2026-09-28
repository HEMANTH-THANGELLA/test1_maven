package kmit.test1_maven;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    void testMessage() {
        assertEquals("Hello Jenkins1!", App.message());
    }
}