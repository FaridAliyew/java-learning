import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Create a Scanner object to read input from the user

        Scanner scanner = new Scanner(System.in);

        // System.out.print("Enter your name: ");

        // String name = scanner.nextLine();

        // System.out.print("Enter your age: ");
        // int age = scanner.nextInt();


        // System.out.println("Hello, " + name + "!");
        // System.out.println("You are " + age + " years old.");   





        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        if(username.equals("Farid")){
            System.out.println("Welcome, admin!");
        } else {
            System.out.println("Welcome, " + username + "!");
        }
    }
}
