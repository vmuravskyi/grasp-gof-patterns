package gof.design.patterns.gof.templatemethod;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class FacebookTest {

    private Facebook facebook;

    @BeforeEach
    void setUp() {
        facebook = new Facebook("testUser", "testPassword");
    }

    @Test
    void testLogIn() {
        assertTrue(facebook.logIn(facebook.getUserName(), facebook.getPassword()));
    }

    @Test
    void testSendData() {
        assertTrue(facebook.sendData("Test message".getBytes()));
    }

    @Test
    void testLogOut() {
        facebook.logOut();
        assertEquals("testUser", facebook.getUserName());  // Check if userName is still accessible
    }

    @Test
    void testPost() {
        assertTrue(facebook.post("Test message"));
    }

    @AfterEach
    void tearDown() {
        facebook = null;
    }

}