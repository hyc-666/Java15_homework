import java.util.Scanner;

public class GuessNumber{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int number = (int)(Math.random()*101);
    System.out.print("Guess a magic number between 0 and 100!");
    int guess = -1;
    while(guess != number){
      System.out.print("\nEnter your answer:");
      guess = input.nextInt();
        if (guess == number)
          System.out.println("Yes!The number is " + number);
        else if(guess > number)
          System.out.println("Your answer is too high!");
        else
          System.out.println("Your answer is too low!");
      
    }
      
  }
}
