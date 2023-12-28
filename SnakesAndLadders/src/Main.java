import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {


    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int anykey;
        int counter = 0;
        SnakesLadders player1 = new SnakesLadders();
        SnakesLadders player2 = new SnakesLadders();
//        SnakesLadders player3 = new SnakesLadders();
        while (!player1.won && !player2.won) {
//        for (int i = 0; i < 25; i++) {
            player1.play(player1.dice(), player1.dice());
            counter++;
            if (player1.dice1 == player1.dice2)  player1.play(player1.dice(), player1.dice());
            player2.play(player2.dice(), player2.dice());
            counter++;
            if (player2.dice1 == player2.dice2)  player2.play(player2.dice(), player2.dice());
//            anykey = key.nextInt();
        }
        if (player1.won) System.out.println("Player 1 won!");
        else if (player2.won) System.out.println("Player 2 won!");
    }
}