package domain;

public class Exercise {

    public static int Calculate(int number, int originalNumber, int remainder, int result) {
     
        originalNumber = number;
        while (originalNumber != 0) {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }
          if (result == number) {
            System.out.println(number + " is not an Armstrong number.");
        } else {
            System.out.println(number + " is an Armstrong number.");
        }
    }

