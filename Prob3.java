import java.util.Scanner;

public class Prob3 {
  public static void main(String[] args){
  Scanner scan = new Scanner (System.in);

  System.out.println("Enter number of students: ");
  int studentNum = scan.nextInt();

  System.out.println("Enter Name of Students: ");
  String name1 = scan.nextLine();

  System.out.println("Enter the score of students: ");
  double score = scan.nextDouble();

  for (int i = 0; i <= studentNum - 1; i++)
  {
    System.out.println("Enter Name of Student: ");
    String name2 = scan.nextLine();

    System.out.println("Enter the score of student: ");
    double score2 = scan.nextDouble();
  
    if (score > score2)
      {
        name1 = name2;
        score = score2;
      }
  }

  System.out.println("Top student is " + name1 + " and their score is " + score );
  
  }
}



//set up a scanner to enter the number of students the user wants to enter
//prompt the user to enter the user name
//prompt the user for a score
//set up the for loop through the number of students -1
//prompt the user to enter the user name
//prompt the user for a score
//use an if statement to compare the scores and see if one is greater than the other. 
//swap the variable to student 1
//Swap the variable to score 2
//print out the top score
