import java.util.Scanner;

public class Starter {
    public static void main(String[] args) {
        System.out.println("Please enter your name");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        System.out.println("Your name is "+name);

        System.out.println("Hello world Yay this is working");
        System.out.println("I'm in the main now");
        System.out.println("I'm in the other branch");


        System.out.println("Please enter an integer");
        int x = scan.nextInt();
        System.out.println("You entered "+x);
    }
}
