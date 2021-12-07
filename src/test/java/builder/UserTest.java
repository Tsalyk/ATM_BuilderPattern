package builder;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    private User user;

    @BeforeEach
    void setUp() {
        user = User.builder().name("Markiian").age(19).gender("M").weight(70).height(170).race("eu").build();
    }

    @Test
    void getName() {
        assertEquals("Markiian", user.getName());
    }

    @Test
    void getAge() {
        assertEquals(19, user.getAge());
    }

    @Test
    void getGender() {
        assertEquals("M", user.getGender());
    }

    @Test
    void getWeight() {
        assertEquals(70, user.getWeight());
    }

    @Test
    void getHeight() {
        assertEquals(170, user.getHeight());
    }

    @Test
    void getRace() {
        assertEquals("eu", user.getRace());
    }
}