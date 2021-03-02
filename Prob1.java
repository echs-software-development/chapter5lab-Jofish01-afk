import java.util.Scanner;

public class Prob1 {
  public static void main(String[] args){
  Scanner scan = new Scanner (System.in);
  System.out.println("How many grades?:  ");

  int times = scan.nextInt();
  int sum = 0;

  for (int i = 0; i <= times; i++)
  {
    System.out.println("Enter grade " + i + ":");
    int grade = scan.nextInt();
    sum += grade;

  }
  System.out.println("The sum of the grades is: " + sum);
  



  }
}