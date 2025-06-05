package main.java;
import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("number");
        int number = scanner.nextInt();
        doTheFizzBuzz.execute(number);
        scanner.close();
    }

    static class doTheFizzBuzz {
        static void execute(int number) {
            for (int i = 1; i <= number; i++) {
                StringBuilder result = new StringBuilder();
                if (i % 3 == 0) {
                    result.append("Fizz");
                }
                if (i % 5 == 0) {
                    result.append("Buzz");
                }
                if (result.toString().isEmpty()) {
                    result.append(i);
                }
                System.out.print(i + " ");
                System.out.println(result);
            }
        }
    }
}


