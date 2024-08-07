package gof.design.patterns.gof.templatemethod;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class TwitterTest {

    private Twitter twitter;

    @BeforeEach
    void setUp() {
        twitter = new Twitter("testUser", "testPassword");
    }

    @Test
    void testLogIn() {
        assertTrue(twitter.logIn(twitter.getUserName(), twitter.getPassword()));
    }

    @Test
    void testSendData() {
        assertTrue(twitter.sendData("Test message".getBytes()));
    }

    @Test
    void testLogOut() {
        twitter.logOut();
        assertEquals("testUser", twitter.getUserName());  // Check if userName is still accessible
    }

    @Test
    void testPost() {
        assertTrue(twitter.post("Test message"));
    }

    @AfterEach
    void tearDown() {
        twitter = null;
    }

}
