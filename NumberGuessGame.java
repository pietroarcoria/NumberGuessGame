import java.util.Random;
import java.util.Scanner;

public class NumberGuessGame {
    public static void main(String[] args) {
        Random rand = new Random(); //uses the random function
        int numberToGuess = rand.nextInt(100) + 1; //chooses the random number and limits it between numbers 1-100
        Scanner input = new Scanner(System.in); //

        while (true) {
            System.out.print("Guess any number between 1 and 100; "); //prints sentence
            int guess = input.nextInt(); //asks user to write a number

            if (guess == numberToGuess) { //if users guesses correct number
                System.out.println("Correct, the number I chose was " + numberToGuess); //this line is printed
                break;
            } else if (guess < numberToGuess) { //if user uses a number smaller than the correct number 
                System.out.println("The number I chose is higher"); //this line is printed
            } else if (guess > numberToGuess) { //if user uses a number larger than the correct number
                System.out.println("The number I chose is lower"); //this line is printed
            }
        }
        input.close(); 
    }
}
