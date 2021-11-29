import java.util.Scanner;
import java.lang.*;

class IllegalUsernameException extends Exception{
    public IllegalUsernameException(String message) {
        super(message);
    }

}

class IllegalPasswordException extends Exception{
    public IllegalPasswordException(String message) {
        super(message);
    }
}



public class Verification_Pgm {
    public static void main(String[] args) throws IllegalUsernameException, IllegalPasswordException {
        Scanner scanner = new Scanner(System.in);
        String username, password;
        System.out.println("Enter Username:");
        username = scanner.nextLine();
        System.out.println("Enter Password:");
        password = scanner.nextLine();
        if (!(username.length() >= 6 && username.length() <= 15)) {
            throw new IllegalUsernameException("Username must be of length 6-15 characters");
        }
        char first = username.charAt(0);
        if (!(first >= 65 && first <= 90)) {
            throw new IllegalUsernameException("Username must start with an uppercase letter A to Z");
        }
        if (password.length() <= 8 && !(password.length() <= 256)) {
            throw new IllegalPasswordException("Password must not be shorter than 8 characters and not exceed 256 characters");
        }
        for (int i = 0,j=0; i < username.length() && j < password.length(); i++,j++) {
            if (username.charAt(i) == '(' || username.charAt(i) == ')' || username.charAt(i) == '}' || username.charAt(i) == '{' ||
                    username.charAt(i) == '[' || username.charAt(i) == ']' || username.charAt(i) == ' ') {
                throw new IllegalUsernameException("Username should not contain parantheses or whitespaces ");
            }
            if (password.charAt(j) == '(' || password.charAt(j) == ')' || password.charAt(j) == '}' || password.charAt(j) == '{' ||
                    password.charAt(j) == '[' || password.charAt(j) == ']' || password.charAt(j) == ' ') {
                throw new IllegalPasswordException("Password should not contain parantheses or whitespaces ");
            }
        }
        boolean condition = password.toLowerCase().contains(username.toLowerCase());
        if (condition) {
            throw new IllegalPasswordException("Password should not contain or be equal to Username");
        }

    }
}