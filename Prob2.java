import java.util.Scanner;

public class Prob2 {
  public static void main(String[] args){
  Scanner scan = new Scanner (System.in);
  int positive = 0; 
  int negative = 0;
  int count = 0, total =  0, number;

  System.out.println("Enter an integer. (The input ends if it is 0): ");
  number = input.nextInt();

  while (count != 0)
  {
    if (number > 0)
    {
      positive++;
    }
    else if (number < 0)
    {
      negative++;
    }

    total += number;
    count++;

    number = input.nextInt();

  }

  if (count == 0)
  {
    System.out.println("No numbers have been entered execpt 0.");
  }
  else
  {
    System.out.println("Number of positves: " +positive);
    System.out.println("Number of negatives: " +negative);
    System.out.println("Total: " +total);
    System.out.println("Average: " + total * 1.0 / count);
  }

  }
}