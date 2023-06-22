package guessnumber;
import java.util.Scanner;
public class GuessNumber {
  public static void main(String[] args) {    
    int number = (int)(Math.random() * 100); 
    int guessCounter = 1;
    Scanner input = new Scanner(System.in);
    System.out.println("Guess a magic number between 0 and 100");
    System.out.println("\nGuess number - " + guessCounter);
    System.out.println("----------------------------");
    System.out.print("Enter your guess: ");
    int guess = input.nextInt();
    if (guess == number){
        System.out.println("Yes, the number is " + number);
        System.out.println("Total guess: " + guessCounter);
        }else if (guess > number){
        System.out.println("Your guess is too high");
        }else{
        System.out.println("Your guess is too low");
    }
    while(guess!=number){
        guessCounter += 1;
        System.out.println("\nGuess number - " + guessCounter);
        System.out.println("----------------------------");
        System.out.print("Enter your guess: ");
        guess = input.nextInt();
        if (guess == number){
        System.out.println("Yes, the number is " + number);
        System.out.println("Total guess: "+ guessCounter);
        }else if (guess > number){
        System.out.println("Your guess is too high");
        }else{
        System.out.println("Your guess is too low");
        }
    }
  }    
}
