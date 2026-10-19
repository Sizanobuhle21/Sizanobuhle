/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package registrationloginapp;

import java.util.Scanner;

/**
 *
 * @author nobuh
 */ 
public class RegistrationLoginApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Messages mess = new Messages();

        Scanner input = new Scanner(System.in);

        Login login = new Login();
        
        System.out.println("Enter the username");
        String user = input.nextLine();
        if (login.checkUsername(user)) {
            System.out.println("Correct format");
        } else {
            System.out.println("Incorrect format");
        }

        System.out.println("Enter the password");
        String pass = input.nextLine();
        if (login.checkPasswodComplexity(pass)) {
            System.out.println("Correct format");
        } else {
            System.out.println("Incorrect format");
        }
        System.out.println("Enter the CellphoneNumber");
        String number = input.nextLine();
        if (login.checkCellphoneNumber(number)) {
            System.out.println("Incorrect format");
        } else {
            System.out.println("Correct format");
        }
        System.out.println("Welcome back to the chatapp");
        System.out.println("Enter the username you have resgistered in with");
        String newUser = input.nextLine();
        System.out.println("Enter the password you have registered with");
        String newPass = input.nextLine();

        if (login.loginUser(user, pass, newUser, newPass)) {
            System.out.println("User login succesful");
            
            
        } else {
            System.out.println("login unsuccesful");
        }
        
        mess.mainOriginal();
    }
}
