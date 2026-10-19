/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package registrationloginapp;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author nobuh
 */
public class MethodfunctionalityTest {
    
    public MethodfunctionalityTest() {
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

    /**
     * Test of checkMessagesID method, of class Methodfunctionality.
     */
    @Test
    public void testCheckMessagesID() {
        System.out.println("checkMessagesID");
        Methodfunctionality instance = new Methodfunctionality();
        boolean expResult = false;
        boolean result = instance.checkMessagesID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkRecipientCell method, of class Methodfunctionality.
     */
    @Test
    public void testCheckRecipientCell() {
        System.out.println("checkRecipientCell");
        String recipient = "";
        Methodfunctionality instance = new Methodfunctionality();
        boolean expResult = false;
        boolean result = instance.checkRecipientCell(recipient);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createMessageHash method, of class Methodfunctionality.
     */
    @Test
    public void testCreateMessageHash() {
        System.out.println("createMessageHash");
        int messageId = 0;
        int messageNumber = 0;
        String message = "";
        Methodfunctionality instance = new Methodfunctionality();
        boolean expResult = false;
        boolean result = instance.createMessageHash(messageId, messageNumber, message);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sentMessage method, of class Methodfunctionality.
     */
    @Test
    public void testSentMessage() {
        System.out.println("sentMessage");
        String message = "";
        Methodfunctionality instance = new Methodfunctionality();
        boolean expResult = false;
        boolean result = instance.sentMessage(message);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printMessages method, of class Methodfunctionality.
     */
    @Test
    public void testPrintMessages() {
        System.out.println("printMessages");
        String messages = "";
        Methodfunctionality instance = new Methodfunctionality();
        boolean expResult = false;
        boolean result = instance.printMessages(messages);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of returnTotalMessages method, of class Methodfunctionality.
     */
    @Test
    public void testReturnTotalMessages() {
        System.out.println("returnTotalMessages");
        int number = 0;
        Methodfunctionality instance = new Methodfunctionality();
        int expResult = 0;
        int result = instance.returnTotalMessages(number);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of option1 method, of class Methodfunctionality.
     */
    @Test
    public void testOption1() {
        System.out.println("option1");
        Methodfunctionality.option1();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of writeJSONfile method, of class Methodfunctionality.
     */
    @Test
    public void testWriteJSONfile() {
        System.out.println("writeJSONfile");
        Methodfunctionality.writeJSONfile();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of readJsonfile method, of class Methodfunctionality.
     */
    @Test
    public void testReadJsonfile() {
        System.out.println("readJsonfile");
        Methodfunctionality.readJsonfile();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of storeMessage method, of class Methodfunctionality.
     */
    @Test
    public void testStoreMessage() {
        System.out.println("storeMessage");
        Methodfunctionality instance = new Methodfunctionality();
        instance.storeMessage();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
