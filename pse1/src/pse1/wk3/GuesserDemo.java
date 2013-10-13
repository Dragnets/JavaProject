//GuesserDemo
package pse1.wk3;

/**
 *
 * @author peterrosner
 */
public class GuesserDemo {
    public static void main(String[] args) {
        System.out.println("Making a Guesser");
        Guesser guess = new Guesser();
        System.out.println("Now asking 5 questions");
        guess.askQuestions(5);
        System.out.println("Finally ask the guesser object what occured");
        System.out.println(guess);
    }
}
