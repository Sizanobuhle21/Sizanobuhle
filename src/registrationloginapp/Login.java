/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package registrationloginapp;

/**
 *
 * @author nobuh
 */
public class Login {

    public boolean checkUsername(String username) {
        if (username.contains("_") && username.length() <= 5) {

            return true;
        } else {
        }

        return false;
    }


    public boolean checkPasswodComplexity(String password) {

        //Password must contain at least 8 characters 
        boolean length = password.length() >= 8;
        boolean hasUpper = password.matches(".*[A-Z].*");
        boolean hasDigit = password.matches(".*[0-9].*");
        boolean hasSpecial = password.chars().anyMatch(c -> !Character.isLetterOrDigit(c));

        return length && hasUpper && hasDigit && hasSpecial;
    }

    public boolean checkCellphoneNumber(String cellphonenumber){
        String regex = "\\+27[0-9]{9}";
        return cellphonenumber.matches(regex);
        }
    

    public String registerUser(String username, String password, String cellnum) {
        boolean IsUsernameCorrect = checkUsername(username);
        boolean IsPasswordCorrect = checkPasswodComplexity(password);
        boolean IsPhoneNumberCorrect = checkCellphoneNumber(cellnum);

        if (!IsUsernameCorrect) {
            return "Username is formated correctly";
        }
        if (!IsPasswordCorrect) {
            return "Password does not meet the correct complexity";
        }
        if (!IsPhoneNumberCorrect) {
            return "Phonenumber does not meet the correct complexity";
        }
        return "error occured";
    }
    public boolean loginUser(String username, String password, String newUsername, String newPasssword) {
        if (username.equals(newUsername) && password.equals(password)) {
            return true;
        } else {
            return false;
        }
    }

    public String returnLoginStatus(boolean LoginSuccessful) {

        if (LoginSuccessful) {
            return "Welcome back, your Login Successful ";
        } else {
            return "Failed login, please check username and password";
        }
    }
}
