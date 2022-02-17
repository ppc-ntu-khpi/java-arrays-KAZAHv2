//package test;
import java.util.Scanner;


public class TestResult {

       public static void main(String[] args) 
    {
        System.out.print("Введіть ваше число: ");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        
        System.out.println("Ваше число Армстронга:"+Exercise.Calculate(number)); 
    }
}
