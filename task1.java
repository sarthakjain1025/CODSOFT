import java.util.*;

class task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maxScore = 100;

        while (true) {
            int k = 5;
            int remainingGuesses = k;
            int answer = (int) (Math.random() * 100) + 1;
            int score = maxScore;

            System.out.println("I am thinking of a number in my mind. You have 5 guesses to guess the correct number.");

            for (int i = 0; i < k; i++) {
                System.out.println("Enter your guess: ");
                int guess = sc.nextInt();
                if (guess > answer) {
                    System.out.println("Oops... The number you chose is larger than the answer... Try again");
                    remainingGuesses--;
                    score -= 20;
                } else if (guess < answer) {
                    System.out.println("Oops... The number you chose is smaller than the answer... Try again");
                    remainingGuesses--;
                    score -= 20;
                } else {
                    System.out.println("Congratulations! You got it right in " + (i + 1) + " attempts.");
                    break;
                }
                System.out.println("You have " + remainingGuesses + " more guesses left");
            }

            if (remainingGuesses == 0) {
                System.out.println("Sorry, you've run out of guesses. The correct answer was: " + answer);
                score = 0;
            }

            System.out.println("Your score: " + score);
            System.out.println("Do you want to play again? (yes/no): ");
            String playAgain = sc.next();
            
            if (!playAgain.equalsIgnoreCase("yes")) {
                System.out.println("Thanks for playing! Goodbye!");
                break;
            }
        }
    }
}