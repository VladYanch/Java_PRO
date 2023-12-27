import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public class SnakesLadders {
    public int position;
    int num;
    static int numPlayer;

    public int dice1 = 0;
    public int dice2 = 0;

    public boolean won;

    SnakesLadders() {
        this.num = numPlayer+1;
        this.position = 0;
        this.won = false;
        numPlayer++;
    }

    private Map<Integer, Integer> ladders = new HashMap<>();

    {
        ladders.put(2, 38);
        ladders.put(7, 14);
        ladders.put(8, 31);
        ladders.put(15, 26);
        ladders.put(21, 42);
        ladders.put(28, 84);
        ladders.put(36, 44);
        ladders.put(51, 67);
        ladders.put(71, 91);
        ladders.put(78, 98);
        ladders.put(87, 94);
    }

    Map<Integer, Integer> snakes = new HashMap<>();

    {
        snakes.put(16, 6);
        snakes.put(49, 11);
        snakes.put(46, 25);
        snakes.put(62, 19);
        snakes.put(64, 60);
        snakes.put(74, 53);
        snakes.put(89, 68);
        snakes.put(92, 88);
        snakes.put(95, 75);
        snakes.put(99, 80);
    }

    public String play(int die1, int die2) {
        dice1 = die1;
        dice2 = die2;
        System.out.println("Player " + num + " diced " + die1 + " " + die2);
        if (ladders.containsKey(position + die1 + die2)) {
            int lastPosition = position + die1 + die2;
            position = ladders.get(position + die1 + die2);
            System.out.println("Player " + num + " is ladder from " + lastPosition + " to " + position);
        }
        else if (die1 == die2 && ladders.containsKey(position + die1)) {
            int lastPosition = position + die1;
            position = ladders.get(position + die1);
            System.out.println("Player " + num + " is ladder from " + lastPosition + " to " + position);
        }
        else if (snakes.containsKey(position + die1 + die2))  {
            int lastPosition = position + die1 + die2;
            position = snakes.get(position + die1 + die2);
            System.out.println("Player " + num + " is snaked from " +lastPosition + " to " + position);
        }
        else if (die1 == die2 && snakes.containsKey(position + die1)) {
            int lastPosition = position + die1;
            position = snakes.get(position + die1);
            System.out.println("Player " + num + " is snaked from " + lastPosition + " to " + position);
        }
        else position += die1 + die2;
        if (position > 100) position = 100 - position + 100 ;
        else if (position + die1 + die2 == 100) {
            won = true;
            return "Player num is won";
        }
        String result = "Player " + num + " is on square " + position;
        System.out.println(result);
        return result;
    }

    public int dice() {
        int number;
        Random dice = new Random();
        number = dice.nextInt(5);
        number++;
        return number;
    }
}