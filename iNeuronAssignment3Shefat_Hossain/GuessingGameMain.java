import java.util.Scanner;

class Guesser {
    int guessNum;
    // int i=10;

    int guessNum() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Guesser kindly guess the number: ");
        guessNum = scan.nextInt();

        return guessNum;
    }

}

class Player {
    int guessNum;

    int guessNum() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Player kindly guess the number: ");
        guessNum = scan.nextInt();

        return guessNum;
    }

}

class Umpire {
    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;

    void collectNumFromGuesser() {
        Guesser guesser = new Guesser();
        numFromGuesser = guesser.guessNum();
    }

    void collectNumFromPlayers() {
        Player player1 = new Player();
        Player player2 = new Player();
        Player player3 = new Player();

        numFromPlayer1 = player1.guessNum();
        numFromPlayer2 = player2.guessNum();
        numFromPlayer3 = player3.guessNum();

    }

    void compare() {
        if (numFromGuesser == numFromPlayer1) {
            if (numFromGuesser == numFromPlayer2 && numFromGuesser == numFromPlayer3) {
                System.out.println("All the players won the game");
            } else if (numFromGuesser == numFromPlayer2) {
                System.out.println("Player  1 and 2 won the game");
            } else if (numFromGuesser == numFromPlayer3) {
                System.out.println("Player 1 and 3 won the game");
            } else {
                System.out.println("Player 1 won the game");
            }

        } else if (numFromGuesser == numFromPlayer2) {
            if (numFromGuesser == numFromPlayer3) {
                System.out.println("Player  2 and 3 won the game");

            } else
                System.out.println("Player 1 won the game");

        } else if (numFromGuesser == numFromPlayer3) {
            System.out.println("Player 3 won the game");
        } else
            System.out.println("Game lost try again");

    }

}

public class GuessingGameMain {
    public static void main(String[] args) {
        Umpire umpire = new Umpire();
        umpire.collectNumFromGuesser();
        umpire.collectNumFromPlayers();
        umpire.compare();
    }
}
