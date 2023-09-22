package Simple_multiplication;

import java.util.Scanner;

//DESCRIPTION:
//This kata is about multiplying a given number by eight if it is an even number and by nine otherwise.
//SOLUTION:
public class Main {
    public static int simpleMultiplication(int n) {
        switch (n % 2) {
            case (0): return n * 8;
            default: return n * 9;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(simpleMultiplication(n));
        scanner.close();
    }
   }