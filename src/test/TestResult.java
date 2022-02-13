package test;
import java.util.Scanner;
import domain.Exercise;

public class TestResult {

    public static void main(String[] args) {

        System.out.print("Введіть ваше число: ");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int result = 0;

        if (result == number) {
            System.out.println(number + " is not an Armstrong number.");
        } else {
            System.out.println(number + " is an Armstrong number.");
        }
    }
}
