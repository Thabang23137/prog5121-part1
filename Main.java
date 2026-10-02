package prog5121poe;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter First Name: ");
        String firstName = input.nextLine();

        System.out.print("Enter Last Name: ");
        String lastName = input.nextLine();

        System.out.print("Enter Username: ");
        String username = input.nextLine();

        System.out.print("Enter Password: ");
        String password = input.nextLine();

        System.out.print("Enter Cell Number: ");
        String cell = input.nextLine();

        Login user = new Login(firstName, lastName,
                username, password, cell);

        System.out.println(user.registerUser());

        System.out.print("Login Username: ");
        String loginUser = input.nextLine();

        System.out.print("Login Password: ");
        String loginPass = input.nextLine();

        boolean result = user.loginUser(loginUser, loginPass);

        System.out.println(user.returnLoginStatus(result));
    }
}
