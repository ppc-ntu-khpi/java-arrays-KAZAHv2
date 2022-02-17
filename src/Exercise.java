


//package domain;
public class Exercise {

  public static boolean Calculate(int number)
    {
        int[] numbers; 
        numbers = new int[(int) (Math.log10(number) + 1)];
        int result = 0;  
        int step = (int) (Math.log10(number) + 1);  
        int originalNumber = number;  
        for(int i = 0; i < step; i++)
        {
            numbers[i] = originalNumber%10; 
            result += Math.pow(numbers[i],step); 
            originalNumber /= 10; 
        }
      return result == number;
    }
}

 
 