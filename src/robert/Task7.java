package robert;

public class Task7 {

        /*
                         Password Validation Task

    1. Write a return method that can verify if a password is valid or not.
    requirements:
    1. Password MUST be at least have 6 characters and should not contain space
    2. PassWord should at least contain one upper case letter
    3. PassWord should at least contain one lowercase letter
    4. Password should at least contain one special characters
    5. Password should at least contain a digit

    if all requirements above are met, the method returns true, otherwise returns  false
    */

    public static void main(String[] args) {

        System.out.println(PasswordValidation("q14wQ!"));

    }

    public static boolean PasswordValidation(String password) {                 // Will use methods from Character Wrapper class

        if ((password.length() < 6) || (password.contains(" "))) {

            return false;
        }

        for (int i = 0; i < password.length(); i++) {

            if (Character.isUpperCase(password.charAt(i))) {                    // If there is an uppercase, go inside inner loop, otherwise false

                for (int k = 0; k < password.length(); k++) {

                    if (Character.isLowerCase(password.charAt(k))) {            // If there is a lowercase, go inside inner loop, otherwise false

                        for (int j = 0; j < password.length(); j++) {

                            if (Character.isDigit(password.charAt(j))) {        // If there is a digit, go inside inner loop, otherwise false

                                for (int t = 0; t < password.length(); t++) {

                                    if (!Character.isLetterOrDigit(password.charAt(t))) {   // if there is a special character (not a letter, nor a digit) --> valid password, otherwise false

                                        return true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
}