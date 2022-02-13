package domain;

public class Exercise {

    public static int Calculate(int number, int originalNumber, int remainder, int result) {
     
        originalNumber = number;
        while (originalNumber != 0) {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }
    return result;
    }
}

