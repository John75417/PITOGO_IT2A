import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = input.nextLine();

        System.out.print("Enter Birth Year: ");
        int birthYear = input.nextInt();
        input.nextLine(); // consume newline

        System.out.print("Enter Gender: ");
        String gender = input.nextLine();

        System.out.println();
        System.out.println("Hello, " + name + "! Welcome to Java Programming!");
        System.out.println("You were born in " + birthYear +
                " and your gender is " + gender + ".");

        input.close();
    }
}
