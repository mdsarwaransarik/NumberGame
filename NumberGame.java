import java.util.Scanner; 
public class NumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;
        int rounds = 0;
        boolean playAgain = true;

        while (playAgain) {
            int targetNumber = (int) (Math.random() * 100) + 1;
            int attempts = 0;
            boolean guessedCorrectly = false;

            System.out.println("Welcome to the Number Game!");
            System.out.println("Guess a number between 1 and 100.");

            while (!guessedCorrectly && attempts < 10) {
                System.out.print("Enter your guess: ");
                int guess = scanner.nextInt();
                attempts++;

                if (guess == targetNumber) {
                    System.out.println("Congratulations! You guessed the correct number.");
                    guessedCorrectly = true;
                    score += 10;
                } else if (guess < targetNumber) {
                    System.out.println("Too low! Try again.");
                } else {
                    System.out.println("Too high! Try again.");
                }
            }

            if (!guessedCorrectly) {
                System.out.println("Oops! You ran out of attempts. The correct number was " + targetNumber);
            }

            rounds++;
            System.out.println("Your score: " + score);
            System.out.print("Do you want to play again? (yes/no): ");
            String playAgainInput = scanner.next();

            if (playAgainInput.equalsIgnoreCase("no")) {
                playAgain = false;
            }
        }

        System.out.println("Thanks for playing the Number Game!");
        System.out.println("Total rounds played: " + rounds);
        System.out.println("Final score: " + score);
    }
}
