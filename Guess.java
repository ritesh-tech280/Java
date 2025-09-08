import java.util.Scanner;
import java.util.Random;

class GuesstheNumber {
    int number;
    int num;
    private int noOfGuesses;

    public GuesstheNumber() {
        Random rand = new Random();
        int random = rand.nextInt(20) + 1;
        number = random;
        noOfGuesses = 0;

    }

    public void takeUserInput(Scanner sc) {

        System.out.print("Guess the number(1 - 20) : ");
        num = sc.nextInt();
        noOfGuesses++;

    }

    public boolean isCorrectNumber() {
        if (num == number) {
            System.out.println("Congratulations you guessed it right.");
            return true;
        } else if (num > number) {
            System.out.println("You Guess Too High.");
        } else {
            System.out.println("You Guess Too Low.");
        }
        return false;

    }
     public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
     }
    public int getNoOfGuesses() {
        return noOfGuesses;

    }

}

public class Guess {
    public static void main(String[] args) {
        /*
         * Create a class Game, Which allows a user to play "Guess The Number" game
         * Once, Game should have the following methods :
         * 1. Constructer to generate the random number
         * 2. takeUserInput() to take a user input of number
         * 3. isCorrectNumber() to detect whether the nuumber Entered by the user is
         * true
         * 4. getter and setter for noOfGuesses
         * Use Properties such noOffguesses(int ) , etc to get this task done
         */
        GuesstheNumber game = new GuesstheNumber();
        Scanner sc = new Scanner(System.in);
        boolean correct = false;

        System.out.println("=== Welcome to the Guess The Number Game ===");

        while (!correct) {
            game.takeUserInput(sc);
            correct = game.isCorrectNumber();

        }

        System.out.println("You guessed the number in " + game.getNoOfGuesses() + " attempts.");
        sc.close();
    }

}
