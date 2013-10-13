//Week 3 Guesser
package pse1.wk3;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author peterrosner
 */
public class Guesser {

    private SimpleCounter score;
    private SimpleCounter tries;
    private Random randomGenerator;
    private Scanner scanner;

    public Guesser() {
        score = new SimpleCounter(0);
        tries = new SimpleCounter(0);
        randomGenerator = new Random();
        scanner = new Scanner(System.in);
        System.out.println("Are you psychic???");
    }

    public void askForGuess() {
        int target = randomGenerator.nextInt(3) + 1;
        System.out.print("I am guessing a number from 1 to 3 what is it?");
        int guess = scanner.nextInt();
        if (guess >= 1 && guess <= 3) {  //if a valid guess
            this.tries.click();         //add to questions answered
            System.out.printf("You guessed %d and I was thinking of %d\n\n", guess, target);
            if (guess == target) {           //if it is correct
                this.score.click();         //add to number correct
            }
        } else {
            System.out.println("Only 1, 2 or 3 please");
            this.askForGuess();
        }
    }

    public void askQuestions(int numberOfQs) {
        System.out.printf("Asking %d questions\n", numberOfQs);
        for (int i = 0; i < numberOfQs; i++) {
            this.askForGuess();
        }
    }

    @Override
    public String toString() {
        //see if the user has scored more than 1/3 of guesses
        String outcome;
        if (3 * this.score.getCount() > this.tries.getCount()) {
            outcome = "You may have something here!";
        } else {
            outcome = "I don't think you are psychic";
        }
        return ("Out of " + this.tries.getCount() + " you got "
                + this.score.getCount() + " correct "
                + outcome);
    }
}
