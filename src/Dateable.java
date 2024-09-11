import java.util.Scanner;
public class Dateable {

    public static void main(String[] args) {
        Scanner user_age = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int your_age = user_age.nextInt();
        int min_age = (your_age/2) + 7;
        System.out.println(your_age + "-year olds should date somebody who is atleast " + min_age + " years old.");
    }
}
/*

There is a folk rule stating you should only date someone who is at least seven years older than half your age. For example, an 18-year-old needs to date somebody at least 16 years old ( 7 + ( 18 / 2 ) ).

Produce a program that stores your age as an integer in a variable named age. The program then computes and displays the age of the youngest person for whom dating meets the folk rule.

A sample program run could be :

Prompt + input: Enter your age: 19

Output: 19-year olds should date somebody who is at least 16 years old.

Another sample program run could be:

Prompt + input: Enter your age: 22

Output: 22-year olds should date somebody who is at least 18 years old.

Credit: Thanks to Jim Cohoon at The University of Virginia


 */