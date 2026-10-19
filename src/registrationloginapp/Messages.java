 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package registrationloginapp;
import java.nio.file.Files;
import java.nio.file.Path;
import java.io.IOException;
import java.util.Scanner;
import java.util.Random;
/**
 * // The Messages class handles the Quickchat menu and message options.
 * @author Student
 */
 public class Messages {

     //Variables used to store the users choice and message information
    static int option;
    static int messageID;
    static String message;
    static String number;
    static int i;
    static int n;

    //This method dispays the Original Quickchat menu 
    public void mainOriginal() {
        
        //Create an object to access the message functinality
        Methodfunctionality l = new Methodfunctionality();
        
        //Repeat the menu until the user chooses option 3 to quit
        do {
            
            //Create a Scanner to read input from the keyboard
            Scanner scan = new Scanner(System.in);
            
            //Display the Quickchat menu options
            System.out.println("Welcome to Quickchat");
            System.out.println("1) Send Messages");
            System.out.println("2) Show recently sent messages");
            System.out.println("3) Quit");

            //Read the option selected by the user
            option = scan.nextInt();

            //Check whether the user selected option 1
            if (option == 1) {
                
                //Call the method responsible for sending messages
                sendMessages();
                
                //Check whether the user selected option 2 
            } else if (option == 2) {
                
                //Read and display messages stored in the JSON file
                l.readJsonfile();
                
                //Check whether the user selected option 3 
            } else if (option == 3) {
                
                //Display a message before exiting the menu
                System.out.println("Quit");
            }
            
            //Continue displaying the menu until option 3 is selected
        } while (option != 3);
    }
    
    //Method used to send messages to recipient
    public static void sendMessages() {
        
        //Create an object to access message functionality
        Methodfunctionality k = new Methodfunctionality();
        Login key = new Login();
        Scanner scan = new Scanner(System.in);
        Random no = new Random();
        
        //Ask the user how many messages they want to send
        System.out.println(" enter number of messages you want to send");
        
        //Read the number of messages they want to send
        n = scan.nextInt();
        scan.nextLine();
        
        //Repeat the process for the requested number of messages
        for (i = 0; i < n; i++) {
            
            //Generate a random messageID
            messageID = no.nextInt(1000000000) + 999999999;

            //Ask the user to enter the recipients cellphone number
            System.out.println(" enter the recipient number");
            number = scan.nextLine();
            
            //Check whether the cellphone number has the correct format
            if (key.checkCellphoneNumber(number)) {
                
                //Display a confirmation if the number is valid
                System.out.println("Correct format");

                //Ask the user to enter a message
                System.out.println("Write a message");
                
                //Read the message entered by the user
                message = scan.nextLine();
                
                //Check whether the message exceeds 250 characters
                if (message.length() > 250) {
                    System.out.println("Please enter message of less than 250 characters");

                } else {
                    
                    //Display the available message options
                    System.out.println("Please choose from the given options");
                    System.out.println("1) send message");
                    System.out.println("2) Disregard message");
                    System.out.println("3) Store message to send later");
                    
                    //Ask the user to select an option
                    System.out.println("Please enter your choice");
                    int input = scan.nextInt();
                    
                    //If the user chooses 1, send the message
                    if (input == 1) {
                        k.option1();
                        
                    //If the user choose 2, disregard the message
                    } else if (input == 2) {
                        
                        //Ask the user enter 0 to delete the message
                        System.out.println("Press 0 to delete the message");
                        
                        //Read the users confirmation
                        int zero = scan.nextInt();
                        if (zero == 0) {
                            System.out.println("Message deleted successfully");
                        }
                    } else if (input == 3) {
                        k.writeJSONfile();

                    } else {
                        System.out.println("Please enter the correct option");
                    }

                }
            } else {
                System.out.println("Incorrect");
            }

        }
         System.out.println("The total number of messages sent" + i);
    }
}

class Methodfunctionality {

    public boolean checkMessagesID() {
        return false;
    }

    public boolean checkRecipientCell(String recipient) {

        return false;
    }

    public boolean createMessageHash(int messageId, int messageNumber, String message) {

        return false;

    }

    public boolean sentMessage(String message) {
        return false;
    }

    public boolean printMessages(String messages) {
        return false;
    }

    public int returnTotalMessages(int number) {
        return number;
    }

    public static void option1() {
        Messages k = new Messages();
        String messageString = String.valueOf(k.messageID);
        char firstNum = messageString.charAt(0);
        char secondNum = messageString.charAt(1);
        String numString = String.valueOf(firstNum + "" + secondNum);
        String[] array = k.message.split(" ");
        String firstWord = array[0];
        String secondWord = array[array.length - 1];
        System.out.println("Message sent ");


        System.out.println("ID: " + k.messageID);
        System.out.println(numString + ":" + k.n + ":" + firstWord + ":" + secondWord);
        System.out.println("recipient number" + k.number);
        System.out.println("Short message " + k.message);

    }

    public static void writeJSONfile() {
        Messages j = new Messages();
        String jsonfile = "{\"message\": \"" + j.message + "\"}";
        try { 
            Files.writeString(Path.of("user.json"), jsonfile);
            System.out.println("Message saved to JSON file");
        }
        catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void readJsonfile() {
       try {
           String jsonfile = Files.readString(Path.of("user.json"));
       
           //Display the contents
           System.out.println("JSON file content: ");
           System.out.println(jsonfile);
       }
       catch (IOException e){
           System.out.println("Error reading file: " + e.getMessage());
       }
    }


    public void storeMessage() {

    }
}
    


