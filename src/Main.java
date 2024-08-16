import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        User user = new User();
        while (true) {
            System.out.println("""
                    Commands
                                       
                    1: Register:
                    2: Login:
                    3: Exit:
                        
                    Write command:
                    """);

            user.allUser();

            String command = scanner.nextLine();
            switch (command.toLowerCase()) {
                case "1", "Register" -> {
                    User newUser = registerMethod();
                    user.addUser(newUser);
                }
                case "2", "Login" -> {
                    loginMethod(user);
                }
                case "3", "Exit" -> {
                    System.out.println("Exit");
                    return;
                }
                default -> System.out.println("Invalid command");
            }
        }
    }

    public static User registerMethod() {
        Scanner scanner = new Scanner(System.in);
        User user = new User();


        while (true) {
            System.out.println("Your name: ");
            boolean name = user.chekName(scanner.nextLine());
            if (name) break;
        }
        while (true) {
            System.out.println("Your Last Name:");
            boolean lastName = user.chekLastName(scanner.nextLine());
            if (lastName) break;
        }
        while (true) {
            System.out.println("Your email");
            boolean email = user.chekEmail(scanner.nextLine());
            if (email) break;
        }
        while (true) {
            System.out.println("Your password");
            boolean password = user.chekPassword(scanner.nextLine());
            if (password) break;
        }
        System.out.println(user);
        System.out.println();

        return user;
    }

    public static void loginMethod(User user) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Your email");
        String email = scanner.nextLine();

        User foundUser = user.finddByEmail(email);
        if (foundUser != null){
            System.out.println("Кош  кел " + foundUser.getFirstName());
        }else {
            System.out.println("мындай колдонуучу жок");
        }
    }
}
//            while (true) {
//                System.out.println("Your products");
//                boolean produkts = user.chekProducts(scanner.nextLine());
//                if (produkts) break;
//                break;
//            }
