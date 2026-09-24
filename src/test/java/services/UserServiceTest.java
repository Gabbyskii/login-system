package services;

import entities.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserServiceTest {


    @Test
    void validatePasswordTooShort() {
        UserService userService = new UserService();
        assertFalse(userService.validatePassword("1234"));

    }

    @Test
    void validatePasswordTooLong() {
        UserService userService = new UserService();
        assertEquals(false, userService.validatePassword("19288365"));

    }




}