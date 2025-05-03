import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!Welcome to Java programming.");
        scanner.close();
    }
}
