import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {

    public static void main(String[] args) {
        int counter = 1;
        SnakesLadders player1 = new SnakesLadders();
        SnakesLadders player2 = new SnakesLadders();
        while (!player1.won && !player2.won) {
            if (!player1.won) {
                System.out.println(counter++);
                player1.play(player1.dice(), player1.dice());
            }
            if (!player1.won && player1.dice1 == player1.dice2) {
                System.out.println(counter++);
                player1.play(player1.dice(), player1.dice());
            }
            if (!player1.won) {
                System.out.println(counter++);
                player2.play(player2.dice(), player2.dice());
            }
            if (!player2.won && player2.dice1 == player2.dice2) {
                System.out.println(counter++);
                player2.play(player2.dice(), player2.dice());
            }
        }
        if (player1.won) System.out.println("Player 1 win on step " + counter);
        else if (player2.won) System.out.println("Player 2 win on step " + counter);
    }
}