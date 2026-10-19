/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import registrationloginapp.Login;

/**
 *

 */
public class RegistationLoginTest {
    Login login = new Login();
    
    public RegistationLoginTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testSomeMethod() {
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    @Test
    public void testValidUsername() {
        assertTrue(login.checkUsername("kyl_1"));
    }

    @Test
    public void testInvalidUsername() {
        assertFalse(login.checkUsername("ky"));
    }

    @Test
    public void testValidPassword() {
        assertTrue(login.checkPasswodComplexity("Abcd123!"));
    }

    @Test
    public void testInvalidPassword() {
        assertFalse(login.checkPasswodComplexity("password"));
    }

    @Test
    public void testValidCellphoneNumber() {
        assertTrue(login.checkCellphoneNumber("+27812345678"));
    }

    @Test
    public void testInvalidCellphoneNumber() {
        assertFalse(login.checkCellphoneNumber("0812345678"));
    }

    @Test
    public void testCellphoneNumberTooShort() {
        assertFalse(login.checkCellphoneNumber("+2781234567"));
    }

    @Test
    public void testSuccessfulLogin() {
        assertTrue(login.loginUser(
                "kyl_1",
                "Abcd123!",
                "kyl_1",
                "Abcd123!"
        ));
    }

    @Test
    public void testUnsuccessfulLogin() {
        assertFalse(login.loginUser(
                "kyl_1",
                "Abcd123!",
                "kyl_1",
                "WrongPassword1!"
        ));
    }
}
