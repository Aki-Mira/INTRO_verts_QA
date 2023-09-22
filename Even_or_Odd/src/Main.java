import java.util.Scanner;

//DESCRIPTION:
//        Create a function that takes an integer as an argument and returns "Even" for even numbers or "Odd" for odd numbers.
//SOLUTION:
public class Main{
    public static String even_or_odd(int number) {
        if (number % 2 == 0) {
            return "Even";
        }
        return "Odd";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int number = scanner.nextInt();
        System.out.println(even_or_odd(number));
        scanner.close();
    }

}