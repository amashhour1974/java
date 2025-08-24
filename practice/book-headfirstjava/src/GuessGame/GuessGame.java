package GuessGame;

import java.util.Scanner;

// Player class
class Player {
    Scanner input = new Scanner(System.in);
    int number;

    void guess() {
        System.out.println("I am guessing :  : ");
        number = input.nextInt(); // getting an integer
    }
}

// Guess Game class
public class GuessGame {

    Player p1;
    Player p2;
    Player p3;

    public void startGame() {

        p1 = new Player();
        p2 = new Player();
        p3 = new Player();

        int guessp1 = 0;
        int guessp2 = 0;
        int guessp3 = 0;

        boolean p1isRight = false;
        boolean p2isRight = false;
        boolean p3isRight = false;

        int targitNumber = (int) (Math.random() * 10);

        System.out.println("I am think of number between 0 to 9...");

        while (true) {
            System.out.println("Number to guess is " + targitNumber);

            p1.guess();
            p2.guess();
            p3.guess();

            guessp1 = p1.number;
            System.out.println("Player one guesses : " + guessp1);
            guessp2 = p2.number;
            System.out.println("Player two guesses : " + guessp2);
            guessp3 = p3.number;
            System.out.println("Player three guesses : " + guessp3);

            if (guessp1 == targitNumber) {
                p1isRight = true;
            }
            if (guessp2 == targitNumber) {
                p2isRight = true;
            }
            if (guessp3 == targitNumber) {
                p3isRight = true;
            }

            // if any player is right
            if (p1isRight || p2isRight || p3isRight) {
                System.out.println("We have a winner...");
                System.out.println("Player one got it right ? " + p1isRight);
                System.out.println("Player two got it right ? " + p2isRight);
                System.out.println("Player three got it right ? " + p3isRight);
                System.out.println("Game is over .");
                break;
            } else {
                // we should keep going because nobodu got it right.
                System.out.println("Players will have try again. ");
            } // end if

        } // end loop

    } // end method
} // end class

// GameLauncher Main Class
class GameLauncher {
    public static void main(String[] args) {
        GuessGame GG = new GuessGame();
        GG.startGame();

    }

}