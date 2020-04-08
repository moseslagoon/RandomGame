import java.util.Random;
import java.util.Scanner;

/**
 * Alvin Lagoon
 */
public class LabAssign4_Lagoon {

    public static void main(String[] args) {
        System.out.println("Random Guessing Game: \n");

        int winCount = 0;
        int lossCount = 0;
        int gamesPlayed = 0;
        int guess;              // user input guess

        Scanner sc = new Scanner(System.in);
        String playAgain = "";

        do {
            Random rand = new Random();
            int randomNumber = rand.nextInt(11);

            System.out.print("Guess a number between 1 and 10: ");
            guess = sc.nextInt();
            if(guess == randomNumber) {
                System.out.println("You won!");
                winCount++;
            } else {
                System.out.printf("That's wrong, the number was " + randomNumber
                        + "\n");
                lossCount++;
            }
            System.out.print("Enter YES to play again --> ");
            playAgain = sc.next().toLowerCase();
            if(playAgain.equals("yes")) {
                gamesPlayed++;
            }

        } while(playAgain.equals("yes"));


        // PRINT STATS
        System.out.println("-------------------------------------------------");
        System.out.printf("Games Played: " + gamesPlayed + "\n");
        System.out.printf("Games Won: " + winCount + "\n");
        System.out.printf("Games Lost: " + lossCount + "\n");
    }

}
