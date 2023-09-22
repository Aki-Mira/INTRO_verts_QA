import java.util.Scanner;
//DESCRIPTION:
//        Implement a function called multiply, which takes two numbers and returns their product:
//
//        multiply(2, 3) = 6
//        multiply(0, 188) = 0
//        multiply(85, 144) = 12240
//SOLUTION:
public class Main {
    public static int multiply (int a, int b) {
        return a * b;
    }
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(multiply(a, b));
        scanner.close();
    }
}
