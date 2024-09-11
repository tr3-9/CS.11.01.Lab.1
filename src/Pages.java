import java.util.Scanner;

public class Pages {

    public static void main(String[] args) {
        Scanner user_age = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int your_age = user_age.nextInt();
        System.out.println(your_age + "-year olds should read atleast " + (100-your_age) + " pages before giving up on a book.");
    }
}
