package c4q.lighterletter;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by c4q-john on 12/5/15.
 */
public class Hangman {
    public static void main(String[] args) {

        String word = generateRandomWord();
        word = word.toLowerCase();
        String hiddenWord = "-";
        int guessesLeft = word.length() * 2;

        for (int i = 0; i < word.length() - 1; i++) {
            hiddenWord = hiddenWord + "-";
        }

        System.out.println(word);
        Scanner scanner = new Scanner(System.in);

        while (guessesLeft != 0) {
            System.out.println("The word now looks like this: " + hiddenWord);
            System.out.println("You have " + guessesLeft + " guesses left.");
            System.out.print("Your guess: ");


            String guess = scanner.next();
            guess = guess.toLowerCase();

            if (word.contains(guess)) {

                System.out.println("That guess is correct.");
                char a = guess.charAt(0);
                hiddenWord = modifyGuess(a, word, hiddenWord);

                if (word.equals(hiddenWord)) {
                    System.out.println("You guessed the word: " + word);
                    System.out.println("You win!");
                    break;
                }

            } else {
                System.out.println("there are no " + guess + "'s in the word.");
                guessesLeft--;
            }

            if (guessesLeft == 0) {
                System.out.println("You're completely hung.");
                System.out.println("The word was: " + word);
                break;
            }

        }

    }

    private static String modifyGuess(char inChar, String word, String currentGuess) {
        int i = 0;
        // I assume word is the original word; currentGuess is "********"
        StringBuilder sb = new StringBuilder(currentGuess);
        while (i < word.length()) {
            if (inChar == word.charAt(i)) {
                sb.setCharAt(i, inChar);
            }
            i++; // you should not put this line in the else part; otherwise it is an infinite loop
        }

        return sb.toString();
    }


    public static String generateRandomWord() {
        ArrayList<String> list = new ArrayList<>();
        list.add(0, "apple");
        list.add(1, "face");
        list.add(2, "life");
        list.add(3, "love");
        list.add(4, "space");
        list.add(5, "peanuts");
        list.add(6, "serendipity");
        list.add(7, "honey");
        list.add(8, "tracktor");
        list.add(9, "spaceship");
        list.add(10, "C4Q");

        int num = ThreadLocalRandom.current().nextInt(0, 11);
        return list.get(num);
    }
}
