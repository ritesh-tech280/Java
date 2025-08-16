import java.util.Scanner;
import java.util.Random;

public class Game {
    public static void main(String[] args) {

        System.out.println("<----------------- Welcome to the Rock, Paper, Scissors game! ------------------>");
        System.out.println("<--------------------- You will play against the computer. --------------------->>");
                Scanner sc = new Scanner(System.in);

        int count = 0;
        int player_score = 0;
        int computer_score = 0;
        
        
        for (int i = 1; i <= 5; i++) {
        System.out.println("Round " + i + ":");
        Random rand = new Random();
        int computer_choice = rand.nextInt(3) + 1;

        System.out.print("Enter your choice: 1 for Rock, 2 for Paper, 3 for Scissors :");
        int user_choice = sc.nextInt();
        switch (user_choice) {
            case 1 -> System.out.println("You choose : Rock");
            case 2 -> System.out.println("You choose : Paper");
            case 3 -> System.out.println("You choose : Scissors");
        }

        String result;
        if (user_choice < 1 || user_choice > 3) {
            System.out.println("Invalid choice - please enter 1, 2, or 3.");
            System.out.println("Game Over...!!");
            sc.close();
            return;
        }    
        if (user_choice == computer_choice) {
            result = "Draw";
        } else if ((user_choice == 1 && computer_choice == 3) ||
                (user_choice == 2 && computer_choice == 1) ||
                (user_choice == 3 && computer_choice == 2)) {
                    result = "You win!";
            player_score++;
        } else {
            result = "Computer wins!";
            computer_score++;
        }
        switch (computer_choice) {
            case 1 -> System.out.println("Computer choose : Rock");
            case 2 -> System.out.println("Computer choose : Paper");
            case 3 -> System.out.println("Computer choose : Scissors");
        }
        System.out.println("Result: " + result);
        System.out.println("Your score: " + player_score);
        System.out.println("Computer score: " + computer_score);
        System.out.println("-----------------------------");
        count++;
    }

    if (player_score > computer_score) {
        System.out.println("Congratulations! You won the game!");
    } else if (player_score < computer_score) {
        System.out.println("Sorry! The computer won the game.");
    } else {
        System.out.println("It's a tie!");
    }
        
        sc.close();
    }
}
